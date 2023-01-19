package com.mt.inheritance.interfaces;

import java.util.Arrays;

public class InterfacesApp {

    public static void main(String[] args) {
        ICount<Integer> count = new CountData();
        System.out.println(count.count(Arrays.asList(1, 12, 2, 545, 656, 545)));
    }
}
