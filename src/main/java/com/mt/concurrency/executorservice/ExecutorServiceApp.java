package com.mt.concurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceApp {

    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(10)) {
            executorService.submit(new Task());
            executorService.shutdown();
        }
    }
}
