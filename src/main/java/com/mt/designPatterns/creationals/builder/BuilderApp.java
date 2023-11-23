package com.mt.designPatterns.creationals.builder;

public class BuilderApp {

    public static void main(String[] args) {
        AirCraft f16 = new AirCraft
                .AirCraftBuilder("NEW ONE", "V-Shape", "Fighter")
                .build();
        System.out.println("F-16 is : " + f16.toString());

        AirCraft passengerPlane = new AirCraft
                .AirCraftBuilder("NEW ONE", "T-Shape", "Passenger")
                .setBathRoom("2-P").build();
        System.out.println("Boeing is : " + passengerPlane.toString());
    }
}
