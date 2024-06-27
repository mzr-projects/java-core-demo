package com.mt.concurrency.future;

import lombok.Setter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@Setter
public class SumCalculator {

    private ExecutorService executorService;

    public Future<Integer> sumCalculation(Integer input) {
        return executorService.submit(() -> {
            Thread.sleep(1000L);
            return input + input;
        });
    }
}
