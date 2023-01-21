package com.mt.solid.liskov;

public class Bicycle extends Manual {

    public Bicycle(String name, double speed) {
        super(name, speed);
    }

    @Override
    protected String startManual() {
        return "We are manually using Bicycle";
    }
}
