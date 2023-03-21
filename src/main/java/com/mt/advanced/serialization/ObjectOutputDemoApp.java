package com.mt.advanced.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputDemoApp {
    public static void main(String[] args) throws IOException {

        try (
                FileOutputStream fos = new FileOutputStream("object.bin");
                ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(fos))
        ) {

            oos.writeObject("Hello man!");
            List<String> items = new ArrayList<>();
            items.add("el1");
            items.add("el2");
            oos.writeObject(items);
            oos.writeObject(null); // Shows end of the file
        }
    }
}
