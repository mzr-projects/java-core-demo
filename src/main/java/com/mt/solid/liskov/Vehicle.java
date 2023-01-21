package com.mt.solid.liskov;

public class Vehicle {
    private String name;
    private double speed;

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
