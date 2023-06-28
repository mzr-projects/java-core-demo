package com.mt.concurrency.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class SumCalculator {

    private ExecutorService executorService;

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public Future<Integer> sumCalculation(Integer input) {
        return executorService.submit(() -> {
            Thread.sleep(1000L);
            return input + input;
        });
    }
}
