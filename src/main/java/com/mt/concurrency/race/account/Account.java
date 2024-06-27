package com.mt.concurrency.race.account;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    public static int balance = 0;
    public final static Object lock = new Object();

    /*
     * Instead of using a lock object and synchronized keyword, we can use atomic variable to increment and decrement in
     * uninterruptible fashion
     * */
    public static AtomicInteger atomicBalance = new AtomicInteger();
}
