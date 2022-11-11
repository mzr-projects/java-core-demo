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
        int centerIndex;
        int startIndex = 0;
        int counter = 0;
        T theElement = null;

        while (startIndex <= dataSize) {
            System.out.println("iteration No," + counter++);

            centerIndex = (startIndex + dataSize) / 2;
            if (data.get(centerIndex).equals(element)) {
                theElement = data.get(centerIndex);
                break;
            } else if (data.get(centerIndex).compareTo(element) < 0) {
                startIndex = centerIndex + 1;
            } else if (data.get(centerIndex).compareTo(element) > 0) {
                dataSize = centerIndex - 1;
            }
        }

        return theElement;
    }
}
