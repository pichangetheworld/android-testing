package com.finc.testingapplication;

/**
 * FiNC Testing App
 */
public class Adder {
    public String func(String x, String y) {
        int x1 = Integer.parseInt(x);
        int y1 = Integer.parseInt(y);

        return String.valueOf(x1 + y1);
    }
}
