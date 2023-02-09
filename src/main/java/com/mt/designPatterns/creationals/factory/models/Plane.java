package com.mt.designPatterns.creationals.factory.models;

public abstract class Plane {

    private PlaneType model;

    protected abstract void construct();

    public Plane(PlaneType planeType) {
        this.model = planeType;
    }

    private void buildPlane() {
        System.out.println("We're building a plane ...");
    }

    public PlaneType getModel() {
        return model;
    }

    public void setModel(PlaneType model) {
        this.model = model;
    }
}
