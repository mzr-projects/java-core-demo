package com.mt.concurrency.ski;

import java.util.concurrent.Semaphore;

public class SkiForRent {

    public static final int MAX_SKI_PAIR = 150;
    private static final int MIN_SKI_IN_STOCK = 5;
    /*
     * The semaphore controls access to a shared resource through the use of a counter if counter is greater than zero
     * the access is allowed if its zero the access is denied. To access the resource, the thread must be granted a permit
     * from the semaphore.
     * Semaphores are often used to restrict the number of threads that can access some (physical or logical) resource
     * */
    private final Semaphore semaphore = new Semaphore(MAX_SKI_PAIR - MIN_SKI_IN_STOCK);
    private final SkiPair[] inventory;

    public SkiForRent() {
        inventory = new SkiPair[MAX_SKI_PAIR];
        for (int i = 0; i < MAX_SKI_PAIR; i++) {
            inventory[i] = new SkiPair(STR."Ski Pair: \{i}", false);
        }
    }

    public SkiPair rentSkiPair() throws InterruptedException {
        semaphore.acquire(); // get the ticket (acquire() is thread safe)
        return getSkiPair(); // use ticket to retrieve a pair
    }

    public void returnSkiPair(SkiPair skiPair) {
        if (isReturnable(skiPair)) {
            semaphore.release(); // release is thread safe
        }
    }

    /*
     * The reason we are using synchronizing here is we cannot send a ski pair for the rent and
     * return it from the rent at the same time, that does not make sense in this kinda business
     * */
    protected synchronized SkiPair getSkiPair() {
        for (SkiPair skiPair : inventory) {
            if (!skiPair.isInUse()) {
                skiPair.setInUse(true);
                return skiPair;
            }
        }
        return null;
    }

    protected synchronized boolean isReturnable(SkiPair skiPair) {
        if (skiPair.isInUse()) {
            skiPair.setInUse(false);
            return true;
        }
        return false;
    }
}