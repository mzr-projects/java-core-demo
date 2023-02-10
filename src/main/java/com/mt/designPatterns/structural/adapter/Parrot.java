package com.mt.designPatterns.structural.adapter;

public class Parrot implements Bird {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is  eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot is making sound");
    }
}
