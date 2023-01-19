package com.mt.generics;

import java.util.*;

public class GenericApp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        MyGeneric<Integer> myGeneric = new MyGeneric<>(stack);
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


        System.out.println("================ generic Methods");
        Set<String> stringSet1 = new HashSet<>();
        stringSet1.add("admin");
        stringSet1.add("employee");
        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("active");
        stringSet2.add("in-active");
        System.out.println(MyGeneric.union(stringSet1, stringSet2));

    }
}
