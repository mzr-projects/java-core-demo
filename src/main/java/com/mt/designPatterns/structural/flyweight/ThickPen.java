package com.mt.designPatterns.structural.flyweight;

public class ThickPen implements Pen {

    private final BrushSize brushSize = BrushSize.THICK;
    private String color = null;

    @Override
    public void draw(String content) {
        System.out.println("Drawing Thick content in color : " + color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
