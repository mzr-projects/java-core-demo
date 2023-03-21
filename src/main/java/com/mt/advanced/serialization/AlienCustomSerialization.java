package com.mt.advanced.serialization;

import java.io.*;

/*
 * Fields can be transient to indicate they are not going to be serialized
 * Static fields are not persisted (They won't get serialized because serialization is on a per-object instance basis)
 * */
public class AlienCustomSerialization implements Serializable {

    private String planet;

    private long id;

    public AlienCustomSerialization(String planet, long id) {
        if (planet == null) throw new NullPointerException("Planet can not be null.");
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

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeBoolean(planet != null);
        if (planet != null)
            out.writeUTF(planet);
        out.writeLong(id);
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException {
        if (in.readBoolean())
            planet = in.readUTF();
        id = in.readLong();
    }
}
