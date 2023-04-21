package com.mt.solid.liskov;

public class Vehicle {
    private final String name;
    private final double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
}
