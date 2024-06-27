package com.mt.concurrency.ski;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SemaphoresApp {
    private static final Random RAND = new Random();

    public static void main(String[] args) {
        final SkiForRent sfr = new SkiForRent();
        Runnable skiPairRentTask = createSkiPairRentTask(sfr);

        int numThreads = SkiForRent.MAX_SKI_PAIR + 1;
        ExecutorService[] executorServices = new ExecutorService[numThreads];
        for (int i = 0; i < numThreads; ++i) {
            executorServices[i] = Executors.newSingleThreadExecutor();
            executorServices[i].execute(skiPairRentTask);
        }
    }

    private static Runnable createSkiPairRentTask(SkiForRent sfr) {
        return () -> {
            try {
                String currentThreadName = Thread.currentThread().getName();
                while (true) {
                    SkiPair sp = sfr.rentSkiPair();
                    System.out.printf("%s renting %s%n", currentThreadName, sp.getName());
                    Thread.sleep(RAND.nextInt(2000));
                    System.out.printf("%s returning %s%n", currentThreadName, sp.getName());
                    sfr.returnSkiPair(sp);
                }
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        };
    }
}
