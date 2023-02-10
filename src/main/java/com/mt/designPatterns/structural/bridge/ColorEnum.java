package com.mt.designPatterns.structural.bridge;

public enum ColorEnum {
    RED("RED"), BLUE("BLUE");

    private final String colorName;

    ColorEnum(String colorName) {
        this.colorName = colorName;
    }

    public String getColor(String colorName) {
        for (var colorNameTemp : ColorEnum.values()) {
            if (colorNameTemp.colorName.equals(colorName))
                return colorName.toLowerCase();
        }
        return null;
    }
}
