package com.mt.generics;

import java.util.Arrays;
import java.util.List;

public class GenericApp {
    public static void main(String[] args) {
        MyGeneric myGeneric = new MyGeneric();
        List<String> stringList = Arrays.asList("BRO", "JIMMY");
        List<Integer> integerList = Arrays.asList(1, 2, 4, 6);

        /*
         * Here we have compile-time error because List<Object> can not hold List<String>, List<Integer> , ...
         * because String, Integer, ... are not subtype of Object
         *
         *         myGeneric.doSomethingObject(stringList);
         *         myGeneric.doSomethingObject(integerList);
         * */

        System.out.println("================ Un-bound ");
        myGeneric.doSomethingUnbound(stringList);
        myGeneric.doSomethingUnbound(integerList);

    }
}
