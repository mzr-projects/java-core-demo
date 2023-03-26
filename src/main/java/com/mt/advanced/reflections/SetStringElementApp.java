package com.mt.advanced.reflections;

import com.mt.inheritance.A;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SetStringElementApp {
    public static void main(String[] args) {
        String[] value = {"a", "b", "c"};
        Array.set(value, 2, "Hello!!!!");
        System.out.println(Arrays.toString(value));
        System.out.println(Array.get(value, 1));
    }
}
