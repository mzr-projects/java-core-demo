package com.mt.concurrency.future;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class FutureApp {
    
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
         * The future is used to represent the result of asynchronous operation
         * */
        ExecutorService futureExecutor = Executors.newFixedThreadPool(2);
        Future<String> future = futureExecutor.submit(() -> {
            Thread.sleep(10000L);
            return "My man";
        });

        while (!future.isDone()) {
            log.info("Doing future thing ...");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        log.info(STR."Result of Future is : \{future.get()}");
        //futureExecutor.shutdown();

        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.setExecutorService(futureExecutor);
        Future<Integer> integerFuture = sumCalculator.sumCalculation(10);
        while (!integerFuture.isDone()) {
            log.info("Calculating the sum ...");
            Thread.sleep(1000L);
        }
        /*
         * get() will block the execution until the task is complete but here the get() is called after making sure
         * the result is ready so we're good here
         * */
        log.info(STR."Sum : \{integerFuture.get()}");
    }
}
