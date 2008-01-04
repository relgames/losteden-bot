package com.losteden.output;

import java.awt.peer.RobotPeer;
import java.awt.*;
import java.awt.event.InputEvent;

public class AutoItWrapper implements Robot {

    private AutoItX3 autoIt;

    public AutoItWrapper() {
        autoIt = new AutoItX3();
    }


    public void mouseMove(int x, int y) {
        autoIt.mouseMove(x, y);
    }

    public void mousePress(int buttons) {
        autoIt.mouseDown(mouseCode(buttons));
    }

    public void mouseRelease(int buttons) {
        autoIt.mouseUp(mouseCode(buttons));
    }

    public void mouseWheel(int wheelAmt) {
        autoIt.mouseWheel(wheelCode(wheelAmt), Math.abs(wheelAmt));
    }

    public void send(String keycode) {
        autoIt.send(keycode);
    }

    public void sleep(int millis) {
        autoIt.sleep(millis);
    }

    public int getPixelColor(int x, int y) {
        return autoIt.pixelGetColor(x, y);
    }

    private String mouseCode(int buttons) {
        switch(buttons) {
            case InputEvent.BUTTON1_MASK:
                return "left";
            case InputEvent.BUTTON2_MASK:
                return "middle";
            case InputEvent.BUTTON3_MASK:
                return "right";
            default:
                throw new IllegalArgumentException("buttons = " + buttons);
        }
    }

    private String wheelCode(int wheelAmt) {
        if (wheelAmt > 0) {
            return "up";
        }  else {
            return "down";
        }
    }

}
