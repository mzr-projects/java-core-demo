package com.mt.algorithms.searches;

import java.util.List;

/*
 * In Binary search the data must be sorted
 * */
public class BinarySearch<T extends Comparable<T>> {

    private static <T> List<T> sortData(List<T> data) {
        return null;
    }

    public T findElementBinarySearch(List<T> data, T element) {

        int dataSize = data.size();
        int centerIndex;
        int startIndex = 0;
        int counter = 1;
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

    public T findElementBinarySearchRecursive(List<T> list, T element, int startIndex) {
        int dataSize = list.size();

        if (list.get(startIndex).equals(element))
            return list.get(startIndex);
        else if (list.get(startIndex).compareTo(element) < 0)
            return findElementBinarySearchRecursive(list, element, ((startIndex + dataSize) / 2) + 1);
        else if (list.get(startIndex).compareTo(element) > 0)
            return findElementBinarySearchRecursive(list, element, ((startIndex + dataSize) / 2) - 1);
        else
            return null;
    }
}
