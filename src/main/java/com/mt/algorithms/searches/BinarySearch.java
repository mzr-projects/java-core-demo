package com.mt.algorithms.searches;

import java.util.List;

/*
 * In Binary search the data must be sorted
 * */
public class BinarySearch<T extends Number & Comparable<T>> {

    private static <T> List<T> sortData(List<T> data) {
        return null;
    }

    public T findElement(List<T> data, T element) {

        int dataSize = data.size();
        int start = 0;
        int centerElement = dataSize / 2;
        T theElement = null;

        for (int i = centerElement; i < dataSize; i++) {
            System.out.println("iteration No," + i);
            if (data.get(i).equals(element)) {
                theElement = data.get(i);
                break;
            } else if (data.get(i).compareTo(element) > 0) {
                dataSize = centerElement - 1;
            } else {
                start = centerElement + 1;
            }
        }

        return theElement;
    }
}
