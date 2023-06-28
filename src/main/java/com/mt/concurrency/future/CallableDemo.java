package com.mt.concurrency.future;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hi man";
    }
}
