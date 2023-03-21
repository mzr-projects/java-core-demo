package com.mt.advanced.serialization;

import com.mt.inheritance.A;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ObjectOutputAlienDemoApp {
    public static void main(String[] args) throws IOException {

        try (
                FileOutputStream fos = new FileOutputStream("alienObject.bin");
                ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(fos))
        ) {
            List<Alien> aliens = new LinkedList<>();
            aliens.add(new Alien("alien_mars", 23234l));
            aliens.add(new Alien("alien_moon", 4345l));
            oos.writeObject(aliens);
            oos.writeObject(null); // Shows end of the file
        }
    }
}
