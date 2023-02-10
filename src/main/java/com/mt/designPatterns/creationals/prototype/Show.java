package com.mt.designPatterns.creationals.prototype;

public class Show implements IPrototype {

    private final String name;

    public Show(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public IPrototype clone() throws CloneNotSupportedException {
        System.out.println("Cloning Show object ...");
        return (Show) super.clone();
    }

    @Override
    public void addEntertainment() {
        System.out.println("Show with name : " + this.name + " added.");
    }
}
