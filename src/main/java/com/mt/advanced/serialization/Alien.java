package com.mt.advanced.serialization;

import java.io.*;

/*
 * Fields can be transient to indicate they are not going to be serialized
 * Static fields are not persisted (They won't get serialized because serialization is on a per-object instance basis)
 * */
public class Alien implements Serializable {

    private final String planet;

    private final long id;

    public Alien(String planet, long id) {
        this.planet = planet;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "planet='" + planet + '\'' +
                ", id=" + id +
                '}';
    }
}
