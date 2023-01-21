package com.mt.solid.liskov;

public class Manual extends Vehicle {

    public Manual(String name, double speed) {
        super(name, speed);
    }

    protected String startManual() {
       return "Start manual.";
    }
}
