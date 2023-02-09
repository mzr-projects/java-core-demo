package com.mt.designPatterns.creationals.factory.models;

public class PlaneFactory {

    public static Plane build(PlaneType planeType) {

        switch (planeType) {
            case FIGHTER -> {
                return new FighterPlane();
            }
            case PASSENGER -> {
                return new PassengerPlane();
            }
        }

        return null;
    }
}
