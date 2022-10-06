package com.mt.generics;

import java.util.List;

public class MyGeneric {

    public void doSomethingObject(List<Object> t) {
        for (Object element : t) {
            System.out.println(element);
        }
    }

    public void doSomethingUnbound(List<?> t) {
        for (Object element : t) {
            System.out.println(element);
        }
    }
}
