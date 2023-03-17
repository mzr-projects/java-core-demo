package com.mt.designPatterns.structural.flyweight;

public class MediumPen implements Pen {

    private final BrushSize brushSize = BrushSize.MEDIUM;
    private String color = null;

    @Override
    public void draw(String content) {
        System.out.println("Drawing Medium content in color : " + color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
