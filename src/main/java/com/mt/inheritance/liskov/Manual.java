package com.mt.inheritance.liskov;

public class Manual extends Vehicle {

    public Manual(String name, double speed) {
        super(name, speed);
    }

    protected String startManual() {
       return "Start manual.";
    }
}
