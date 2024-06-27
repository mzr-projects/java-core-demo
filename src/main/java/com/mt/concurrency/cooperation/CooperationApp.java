package com.mt.concurrency.cooperation;

public class CooperationApp {
    public static void main(String[] args) {
        StackTs st = new StackTs();
        new Popper(st).start();
        new Pusher(st).start();
        new Pusher(st).start();
    }
}
