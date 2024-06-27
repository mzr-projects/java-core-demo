package com.mt.concurrency.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    /*
     * When the producer inserts something to the queue the producer blocks until the item is removed from the queue,
     * The synchronous queue behaves like a pipe
     * */
    private final BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        String[] info = {
                "This is",
                "An important",
                "Data for the",
                "QUEUE"
        };

        try {
            for (String info1 : info) {
                queue.put(info1);
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
