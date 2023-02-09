package com.mt.designPatterns.creationals.prototype;

public class Movie implements IPrototype {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public IPrototype clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie object ...");
        return (Movie) super.clone();
    }
}
