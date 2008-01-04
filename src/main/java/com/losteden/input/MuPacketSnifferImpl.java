package com.losteden.input;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jpcap.*;
import jpcap.packet.Packet;
import jpcap.packet.TCPPacket;

public class MuPacketSnifferImpl implements MuPacketSniffer {
	private final Log log = LogFactory.getLog(this.getClass());
	
	/** 
	 * Max number of bytes captured at once
	 */
	private int packetLenght = 2000;
	
	/**
	 * If true, the interface becomes promiscuous mode
	 */
	private boolean promisc = false;
	
	/**
	 * Timeout of processPacket(). Not all platforms support a timeout; on platforms that don't, the 
	 * timeout is ignored. On platforms that support a timeout, a zero value will cause Jpcap to wait 
	 * forever to allow enough packets to arrive, with no timeout.
	 */
	private int timeout = 20;
	
	/**
	 * Number of packets to be processed at single time by jpcap.processPacket()
	 */
	private int packetCount = 1;
	
	
	/**
	 * List of ports to filter. Source port is being checked, because we need to capture packets from MU Server to our bot
	 */
	private Set<Integer> portFilter = new HashSet<Integer>(Arrays.asList(55901));
	
	/**
	 * Pool of sniffer threads
	 */
	private ExecutorService pool;
	
	public void setPacketLenght(int packetLenght) {
		this.packetLenght = packetLenght;
	}

	public void setPromisc(boolean promisc) {
		this.promisc = promisc;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public void setPacketCount(int packetCount) {
		this.packetCount = packetCount;
	}
	
	public void setPortFilter(Set<Integer> ports) {
		this.portFilter = ports;
	}
	
	
	/**
	 * Sniffer thread for single device 
	 */
	private class PacketThread implements Runnable {
		private JpcapCaptor jpcap;
		
		public PacketThread(JpcapCaptor jpcap) {
			this.jpcap = jpcap;
		}

		private PacketReceiver pr = new PacketReceiver() {
			public void receivePacket(Packet packet) {
				if (packet instanceof TCPPacket) {
					TCPPacket tcpPacket = (TCPPacket)packet;
					Integer port = tcpPacket.src_port; // we need to capture packets sent _from_ MU Server
					if (portFilter.contains(port)) {
						System.out.println(tcpPacket);
					}
				}
				
			}
		};		
		
		public void run() {
			while (!Thread.interrupted()) {
				jpcap.processPacket(packetCount, pr);
			}
			log.info("Shutting down sniffer for " + jpcap.toString());
		}
	}

	public void start() {
		NetworkInterface[] devices = JpcapCaptor.getDeviceList();
		this.pool = Executors.newFixedThreadPool(devices.length);

		for (NetworkInterface device: devices) {
			try {
				JpcapCaptor jpcap = JpcapCaptor.openDevice(device, packetLenght, promisc, timeout);
				pool.execute(new PacketThread(jpcap));
			} catch (IOException e) {
				log.error("Can't initialize device", e);
			}
		}
	}
	
	public void stop() {
		pool.shutdownNow();
	}
	
	
	public static void main(String[] args) throws Exception {
		MuPacketSniffer mups = new MuPacketSnifferImpl();
		
		mups.start();
		//Thread.sleep(5000);
		//mups.stop();
	}
}
