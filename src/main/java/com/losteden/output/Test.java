package com.losteden.output;

public class Test {
    public static void main(String[] args) throws Exception{
        Robot wrapper = new AutoItWrapper();

        wrapper.sleep(1000 * 10);
        wrapper.mouseMove(100, 100);
        System.exit(1);
    }
}
