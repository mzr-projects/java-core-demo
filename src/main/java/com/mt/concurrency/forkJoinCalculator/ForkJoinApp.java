package com.mt.concurrency.forkJoinCalculator;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinApp {
    public static void main(String[] args) {

        try (ForkJoinPool fj = new ForkJoinPool();) {
            FJCalc fjCalc = new FJCalc(4);
            fj.execute(fjCalc);
            System.out.println(STR."ForkJoinCalc : \{fjCalc.join()}");
        }
    }
}
