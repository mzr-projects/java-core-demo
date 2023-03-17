package com.mt.designPatterns.structural.flyweight;

public class ThinPen implements Pen{

    private final BrushSize brushSize = BrushSize.SMALL;
    private String color = null;

    @Override
    public void draw(String content) {
        System.out.println("Drawing Small content in color : " + color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
