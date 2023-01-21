package com.mt.solid.liskov;

public class Motorized extends Vehicle{

    public Motorized(String name, double speed) {
        super(name, speed);
    }

    protected String startEngine(){
        return "Start the engine ...";
    }
}
