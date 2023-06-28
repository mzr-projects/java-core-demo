package com.mt.concurrency.ForkJoinCalculator;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinApp {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FJCalc fjCalc = new FJCalc(4);
        forkJoinPool.execute(fjCalc);
        System.out.println("ForkJoinCalc : " + fjCalc.join());
    }
}
