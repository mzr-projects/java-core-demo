package com.mt.advanced.serialization;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EndOfFileInObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialization();
        System.out.println("========= UnShared writing/reading ");
        serializationWithUnShared();
    }

    public static void serialization() throws IOException,ClassNotFoundException{

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (
                ObjectOutputStream oos = new ObjectOutputStream(baos)
        ) {
            oos.writeObject("Hello my man !!!");
            Map<String, String> greetings = new HashMap<>();
            greetings.put("German", "Guten morgen");
            greetings.put("Greek", "Kalimera");
            greetings.put("Afrikaans", "Gooie more");
            oos.writeObject(greetings);

            /*
             * By using reset it will flush the data and if we change some stuffs in the map for serialization
             * we get the new one instead of the cached one from the serialization
             * */
            //oos.reset();
            greetings.put("Afrikaans", "Goeie more");
            oos.writeObject(greetings);

            oos.writeObject(EndOfFileToken.EOF);
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ) {
            Object object;
            while (!(object = ois.readObject()).equals(EndOfFileToken.EOF))
                System.out.println(object);
        }
    }

    public static void serializationWithUnShared() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (
                ObjectOutputStream oos = new ObjectOutputStream(baos)
        ) {
            oos.writeUnshared("Hello my man !!!");
            Map<String, String> greetings = new HashMap<>();
            greetings.put("German", "Guten morgen");
            greetings.put("Greek", "Kalimera");
            greetings.put("Afrikaans", "Gooie more");
            oos.writeUnshared(greetings);

            /*
             * By using reset it will flush the data and if we change some stuffs in the map for serialization
             * we get the new one instead of the cached one from the serialization
             * */
            oos.reset();
            greetings.put("Afrikaans", "Goeie more");
            oos.writeUnshared(greetings);

            oos.writeUnshared(EndOfFileToken.EOF);
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ) {
            Object object;
            while (!(object = ois.readUnshared()).equals(EndOfFileToken.EOF))
                System.out.println(object);
        }
    }
}
