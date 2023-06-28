package com.mt.concurrency.ForkJoinCalculator;

import java.util.concurrent.RecursiveTask;

public class FJCalc extends RecursiveTask<Integer> {

    private final Integer n;

    public FJCalc(Integer n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n;
        }

        FJCalc fjCalc = new FJCalc(n - 1);
        fjCalc.fork();

        return n * n + fjCalc.join();
    }
}
