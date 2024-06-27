package com.mt.concurrency.cooperation;

public class StackTs {

    private static final int CAPACITY = 8;
    /*
     * This shows an empty stack
     * */
    private int top = -1;
    private final int[] stack = new int[CAPACITY];

    /*
     * When an entire method is synchronized, the implicit lock is current object(this) in Java.
     * Hence method push and pop are effectively locked together (both of them are synchronized)
     * only one maybe accessed at the time. It means we can't have 2 threads push or pop at the same time,
     * and we can't have one thread executing push and another executing pop at the same time
     * */
    public synchronized void push(int value) {
        while ((top + 1) == CAPACITY) { // full ?
            try {
                /*
                 * Here thread is going to wait, it is using no resources, here we say wait indefinitely.
                 * */
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println(STR."\{value} pushed at \{top + 1}");
        stack[++top] = value;
        /*
         * Here we notify all other threads that are waiting on the same lock
         * */
        notifyAll();
    }

    public synchronized void pop() {
        while (top < 0) { // empty ?
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println(STR."\{stack[top]} popped from \{top}");
        top--;
        notifyAll();
    }
}
