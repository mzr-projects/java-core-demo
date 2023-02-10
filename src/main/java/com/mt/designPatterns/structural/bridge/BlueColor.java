package com.mt.designPatterns.structural.bridge;

public class BlueColor implements Color {
    @Override
    public ColorEnum getColor() {
        return ColorEnum.BLUE;
    }
}
