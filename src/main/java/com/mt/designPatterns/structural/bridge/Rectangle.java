package com.mt.designPatterns.structural.bridge;

public class Rectangle implements Shape {

    private final Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void getColor() {
        System.out.println("Rectangle Color is : " + color.getColor());
    }
}
