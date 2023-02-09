package com.mt.designPatterns.creationals.factory.models;

class PassengerPlane extends Plane {

    public PassengerPlane() {
        super(PlaneType.PASSENGER);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("We're constructing a Passenger plane.");
    }
}
