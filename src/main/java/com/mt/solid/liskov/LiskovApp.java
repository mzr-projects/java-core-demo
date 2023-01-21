package com.mt.solid.liskov;

public class LiskovApp {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("VEHICLE", 20);
        System.out.println("v1.name : " + v1.getName() + " ,v1.speed : " + v1.getSpeed());

        v1 = new Car("CAR", 21);
        System.out.println("v1.name : " + v1.getName() + " ,v1.speed : " + v1.getSpeed());

        v1 = new Bicycle("BICYCLE", 22);
        System.out.println("v1.name : " + v1.getName() + " ,v1.speed : " + v1.getSpeed());


        Motorized motorized;
        motorized = new Car("CAR_MOTORIZED", 23);
        System.out.println("motorized.name : " + motorized.getName()
                + " ,motorized.speed : " + motorized.getSpeed()
                + " ,motorized.startEngine : " + motorized.startEngine());

        Manual manual;
        manual = new Bicycle("BICYCLE_MANUAL",24);
        System.out.println("motorized.name : " + manual.getName()
                + " ,motorized.speed : " + manual.getSpeed()
                + " ,motorized.startEngine : " + manual.startManual());

    }
}
