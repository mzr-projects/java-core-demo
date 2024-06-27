package com.mt.concurrency.race.account;

public class Miser extends Thread {

    private final int howMany;

    public Miser(int howMany) {
        this.howMany = howMany;
    }

    @Override
    public void run() {
        for (int i = 0; i < howMany; i++) {
            /*
                synchronized (Account.lock) {
                    Account.balance++;
                }
            */
            Account.atomicBalance.incrementAndGet();
        }
    }
}
