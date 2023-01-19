package com.mt.inheritance.liskov;

public class Car extends Motorized {

    public Car(String name, double speed) {
        super(name, speed);
    }

    @Override
    protected String startEngine() {
        return "We are starting car engine";
    }
}
