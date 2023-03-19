package com.mt.advanced.files;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EndOfFileInObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

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
}
