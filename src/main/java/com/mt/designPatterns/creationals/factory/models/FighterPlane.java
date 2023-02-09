package com.mt.designPatterns.creationals.factory.models;

class FighterPlane extends Plane {

    public FighterPlane() {
        super(PlaneType.FIGHTER);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("We're constructing a Fighter Plane");
    }
}
