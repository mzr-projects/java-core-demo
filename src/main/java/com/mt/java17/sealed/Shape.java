package com.mt.java17.sealed;

/*
 * Here we defined what subtypes this shape interface is going to have (Circle,Rectangle)
 * */
public sealed interface Shape permits Circle, Rectangle {
    default void identify() {
        System.out.println(STR."I am a \{getClass().getName()}");
    }
}
