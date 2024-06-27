package com.mt.concurrency.cooperation;

import java.util.Random;

public class Popper extends Thread {

    private Random rand = new Random();
    private StackTs stackTs;

    public Popper(StackTs stackTs) {
        this.stackTs = stackTs;
    }

    @Override
    public void run() {
        while (true) {
            stackTs.pop();
            try {
                Thread.sleep(rand.nextInt(100));
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
