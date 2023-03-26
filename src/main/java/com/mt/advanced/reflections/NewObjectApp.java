package com.mt.advanced.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

public class NewObjectApp {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        System.out.println("=========== Create new Instance using Reflection");
        ArrayList names = ArrayList.class.newInstance();
        names.add("Maurice");
        names.add("Maziar");
        names.add("Jimmy");
        System.out.println(names);

        System.out.println("========== Constructor using Reflections");
        Constructor<String> newString = String.class.getDeclaredConstructor(String.class);
        String name = newString.newInstance("Maziar");
        System.out.println("name = " + name);
    }
}
