package com.mt.algorithms.searches;

import java.util.List;

public class LinearSearch<T extends Number> {

    public static <T> T linearSearch(List<T> list, T value) {
        for (T t : list) {
            if (t.equals(value)) {
                return t;
            }
        }
        return null;
    }
}
