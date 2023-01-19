package com.mt.algorithms.searches;

import java.util.List;

public class LinearSearch<T> {

    public static <T> T linearSearch(List<T> list, T value) {
        int counter = 1;
        for (T t : list) {
            System.out.println("iteration : " + counter++);
            if (t.equals(value)) {
                return t;
            }
        }
        return null;
    }

    public static <T> T recursiveLinearSearch(List<T> list, T value, int i) {
        if (i > list.size() - 1)
            return null;
        else if (list.get(i) == value)
            return list.get(i);
        else
            return recursiveLinearSearch(list, value, i + 1);
    }
}
