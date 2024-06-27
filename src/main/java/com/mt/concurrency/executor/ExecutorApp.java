package com.mt.concurrency.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public class ExecutorApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = new Invoker();
        executor.execute(() -> {
            System.out.println("Executor !!!");
        });
    }
}
