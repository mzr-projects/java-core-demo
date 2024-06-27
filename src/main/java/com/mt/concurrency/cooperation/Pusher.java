package com.mt.concurrency.cooperation;

import java.util.Random;

public class Pusher extends Thread {

    private Random rand = new Random();
    private StackTs stackTs;

    public Pusher(StackTs stackTs) {
        this.stackTs = stackTs;
    }

    @Override
    public void run() {
        while (true) {
            stackTs.push(rand.nextInt(100));
            try {
                Thread.sleep(rand.nextInt(200));
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
