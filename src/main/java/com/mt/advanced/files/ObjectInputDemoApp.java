package com.mt.advanced.files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputDemoApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
         * Declare each object separately inside the try with resource block
         * */
        try (
                FileInputStream fis = new FileInputStream("object.bin");
                ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(fis))
        ) {
            Object obj;
            while ((obj = ois.readObject()) != null) {
                System.out.println(obj);
            }
        }
    }
}
