package com.mt.advanced.datastrutures.iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Sea sea = new Sea();
        
        for (Octopus octopus : sea) {
            System.out.println(octopus);
        }

        /*
        * Java 8 version
        * */
        sea.forEach(System.out::println);
    }
}
