package com.mt.concurrency.race.account;

public class RaceConditionApp2 {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("RunCondition <times to run>");
            return;
        }

        int timeToRun = Integer.parseInt(args[0]);
        Miser miser = new Miser(timeToRun);
        SpendThrift spendThrift = new SpendThrift(timeToRun);

        miser.start();
        spendThrift.start();

        try {
            miser.join();       // Wait for miser to finish
            spendThrift.join(); // Wait for spendThrift to finish
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println(STR."Final Balance is : \{Account.balance}");
    }
}
