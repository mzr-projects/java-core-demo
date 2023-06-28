package com.mt.concurrency.executorservice;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("The RUN");
    }
}
