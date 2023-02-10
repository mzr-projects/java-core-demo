package com.mt.designPatterns.structural.bridge;

public class BridgeApp {
    public static void main(String[] args) {

        /*
         * Instead of creating BlueRectangle,RedRectangle,BlueCircle and so on
         * We can create a new Interface for Color and use the composition to
         * pass the color of the shape and make life happier
         * */
        Shape rect = new Rectangle(new RedColor());
        Shape circle = new Circle(new BlueColor());

        rect.getColor();
        circle.getColor();
    }
}
