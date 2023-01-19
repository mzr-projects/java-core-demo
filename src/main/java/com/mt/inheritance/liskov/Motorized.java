package com.mt.inheritance.liskov;

public class Motorized extends Vehicle{

    public Motorized(String name, double speed) {
        super(name, speed);
    }

    protected String startEngine(){
        return "Start the engine ...";
    }
}
