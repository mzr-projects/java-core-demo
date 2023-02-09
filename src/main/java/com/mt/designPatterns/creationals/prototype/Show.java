package com.mt.designPatterns.creationals.prototype;

public class Show implements IPrototype {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
}
