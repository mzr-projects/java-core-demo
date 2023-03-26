package com.mt.advanced.reflections;

import java.lang.reflect.Field;

public class PrivateFields {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set("Hello my man !!!", "No WTF ?!".getBytes());
        System.out.println("Hello my man !!!");
    }
}
