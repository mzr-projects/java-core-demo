package com.mt.designPatterns.creationals.factory.models;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PlaneFactory {

    private static final Map<PlaneType, Supplier<Plane>> document = new HashMap<>();

    static {
        document.put(PlaneType.FIGHTER, FighterPlane::new);
        document.put(PlaneType.PASSENGER, PassengerPlane::new);
    }

    public static Plane build(PlaneType planeType) {

        /*
        switch (planeType) {
            case FIGHTER -> {
                return new FighterPlane();
            }
            case PASSENGER -> {
                return new PassengerPlane();
            }
        }
        */

        Supplier<Plane> plane = document.get(planeType);
        if (plane != null) {
            return plane.get();
        }

        throw new IllegalArgumentException(STR."Unknown plane type:\{planeType.name()}");
    }
}
