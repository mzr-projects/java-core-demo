package com.mt.designPatterns.creationals.factory.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Plane {

    private PlaneType model;

    protected abstract void construct();

    public Plane(PlaneType planeType) {
        this.model = planeType;
    }

    private void buildPlane() {
        System.out.println("We're building a plane ...");
    }

}
