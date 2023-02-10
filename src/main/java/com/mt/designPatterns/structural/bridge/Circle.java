package com.mt.designPatterns.structural.bridge;

public class Circle implements Shape {

    public Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void getColor() {
        System.out.println("Circle Color is : " + color.getColor());
    }
}
