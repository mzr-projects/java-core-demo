package com.mt.concurrency.race;

public class RaceConditionApp1 {

    /*
     * This is in a memory location where 2 threads have access to it
     * */
    static int n;

    static final Object lock = new Object();

    static void raceCondition() {
        n = 0;
        long limit = 200000;

        Thread t1 = new Thread(() -> {
            for (long i = 0; i < limit; i++) {
                /*
                 * This seems one statement, but in executable(compiled code) level in the
                 * run method its 2 instructions are running 1st adding 2nd assigning
                 * The following code is actually happening after in execution level
                 * Temp = n + 1;
                 * n = Temp
                 * */

                /*
                 * Here we lock on thread for this operation no other threads have access to this section until
                 * the current thread releases the lock
                 * */
                synchronized (lock) {
                    n = n + 1;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (long i = 0; i < limit; i++) {
                synchronized (lock) {
                    n = n - 1;
                }
            }
        });

        t1.start();
        t2.start();

        /*
         * C1: Temp1 = 5 + 1 = 6
         * C2: Temp2 = 5 - 1 = 4
         * C3: N = Temp2 (n=4)
         * C4: N = Temp1 (n=6)
         *
         * The current value of n is 6 that is incorrect it must be 5 because we have 1 increment of 5 and 1 subtraction
         * but because of race condition we got the wrong answer
         *
         * In other words, n = n + 1 is not atomic (Un-Interruptible)
         * */

        try {
            /*
             * The Main thread will wait until t1 and t2 are completed
             * */
            t1.join(); // Wait here until t1 terminates
            t2.join(); // Wait here until t2 terminates
        } catch (Exception ex) {
            System.out.println(STR."Exception: {}\{ex.getMessage()}");
        }

        System.out.println(STR."n = \{n}");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            raceCondition();
        }
    }
}
