package com.losteden.output;

/**
 * @see java.awt.Robot
 */
public interface Robot {

    /**
     * @see java.awt.Robot#mouseMove(int, int)
     */
    void mouseMove(int x, int y);

    /**
     * @see java.awt.Robot#mousePress(int)
     */
    void mousePress(int buttons);

    /**
     * @see java.awt.Robot#mouseRelease(int)
     */
    void mouseRelease(int buttons);

    /**
     * @see java.awt.Robot#mouseWheel(int)
     */
    void mouseWheel(int wheelAmt);

    /**
     * ^ Ctrl, ! Alt, + Shift, # Win
     * @param keycode The sequence of keys to send.
     */
    void send(String keycode);


    void sleep(int millis);

    /**
     * @see java.awt.Robot#getPixelColor(int, int)
     */
    int getPixelColor(int x, int y);

}
