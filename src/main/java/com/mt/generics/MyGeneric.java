package com.mt.generics;

import java.util.*;

public class MyGeneric<T> {

    private final Stack<T> stack;

    public MyGeneric(Stack<T> stack) {
        this.stack = stack;
    }

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

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    /*
     * If it's the producer we use extends in generics
     * */
    public void pushAll(Iterable<? extends T> src) {
        for (T t : src)
            this.stack.push(t);
    }

    /*
     * if it's consumer we use super in genetics
     * */
    public void popAll(Collection<? super T> dest) {
        while (!stack.isEmpty())
            dest.add(stack.pop());
    }
}
