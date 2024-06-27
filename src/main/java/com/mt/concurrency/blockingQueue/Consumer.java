package com.mt.concurrency.blockingQueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    /*
     * When the producer inserts something to the queue the producer blocks until the item is removed from the queue,
     * The synchronous queue behaves like a pipe
     * */
    private final BlockingQueue<String> queue;
    private final int maxTakes;

    public Consumer(BlockingQueue<String> queue, int maxTakes) {
        this.queue = queue;
        this.maxTakes = maxTakes;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < maxTakes; i++) {
                String s = queue.take();
                System.out.println(STR."Message: \{s}");
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
