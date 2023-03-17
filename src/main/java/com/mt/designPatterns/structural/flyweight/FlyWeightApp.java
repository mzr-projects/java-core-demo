package com.mt.designPatterns.structural.flyweight;

public class FlyWeightApp {
    public static void main(String[] args) {

        Pen redPen = PenFactory.getThinPen("RED");
        redPen.draw("Circle");

        Pen redPen2 = PenFactory.getThinPen("RED");
        redPen2.draw("Circle");

        Pen bluePen = PenFactory.getMediumPen("BLUE");
        bluePen.draw("Triangle");

        Pen yellowPen = PenFactory.getThickPen("Yellow");
        yellowPen.draw("Triangle");

        System.out.println(redPen.hashCode());
        System.out.println(redPen2.hashCode());
        System.out.println(bluePen.hashCode());
    }
}
