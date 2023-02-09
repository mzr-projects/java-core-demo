package com.mt.designPatterns.creationals.factory;

import com.mt.designPatterns.creationals.factory.models.Plane;
import com.mt.designPatterns.creationals.factory.models.PlaneFactory;
import com.mt.designPatterns.creationals.factory.models.PlaneType;

public class FactoryApp {

    public static void main(String[] args) {

        Plane plane = PlaneFactory.build(PlaneType.PASSENGER);
        if (plane != null) {
            System.out.println("Plane(1) model is : " + plane.getModel());
        }

        Plane plane1 = PlaneFactory.build(PlaneType.FIGHTER);
        if (plane1 != null) {
            System.out.println("Plane(2) model is : " + plane1.getModel());
        }
    }
}
