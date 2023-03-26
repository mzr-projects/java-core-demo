package com.mt.advanced.reflections;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class ReflectionApp {
    public static void main(String[] args) {

        System.out.println("========== String has these methods ...");
        Stream
                .of("hello".getClass().getMethods())
                .map((method) -> "\t" + method)
                .forEach(System.out::println);

        System.out.println("========== Class.forName(name)");
        for (String str : args) {
            try {
                Class<?> c = Class.forName(str);
                System.out.println(c.getSimpleName());
                for (Field field : c.getDeclaredFields()) {
                    System.out.println(field);
                }
            } catch (ClassNotFoundException e) {
                System.err.println("No class " + str);
            }
        }
    }
}
