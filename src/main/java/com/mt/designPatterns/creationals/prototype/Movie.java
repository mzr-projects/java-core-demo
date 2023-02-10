package com.mt.designPatterns.creationals.prototype;

public class Movie implements IPrototype {

    private final String name;

    public Movie(String name) {
        this.name = name;
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

    @Override
    public void addEntertainment() {
        System.out.println("Movie with name : " + this.name + " added.");
    }
}
