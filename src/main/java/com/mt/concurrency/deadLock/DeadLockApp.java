package com.mt.concurrency.deadLock;

public class DeadLockApp {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("thread1 holds lock1");
                try {
                    Thread.sleep(2);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("thread1 waiting for lock2");
                System.out.println("\tthread1 needs lock2 to release lock1 ...");

                synchronized (lock2) {
                    System.out.println("\tthread1 holds lock1 and lock2 ...");
                }// lock2 releases here if it can be released
            }// lock1 releases here if it can be released
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("thread2 holds lock2");
                try {
                    Thread.sleep(2);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("thread2 waiting for lock1");
                System.out.println("\tthread2 needs lock1 to release lock2 ...");

                synchronized (lock1) {
                    System.out.println("\tthread2 holds lock2 and lock1 ...");
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
