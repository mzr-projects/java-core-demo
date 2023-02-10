package com.mt.designPatterns.structural.adapter;

public class Eagle implements Bird {

    @Override
    public void fly() {
        System.out.println("Eagle is flying.");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is making sound");
    }
}
