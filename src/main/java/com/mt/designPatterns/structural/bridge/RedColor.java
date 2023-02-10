package com.mt.designPatterns.structural.bridge;

public class RedColor implements Color {
    @Override
    public ColorEnum getColor() {
        return ColorEnum.RED;
    }
}
