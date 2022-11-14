package com.mt.algorithms.searches;

import java.util.List;

public class SearchApp {
    public static void main(String[] args) {

        System.out.println("================== Linear Search ==============");
        System.out.println("Search 6 in {1, 2, 3, 4, 6, 2, 3, 8} : " +
                LinearSearch.linearSearch(List.of(1, 2, 3, 4, 6, 2, 3, 8), 6));

        System.out.println("================== Recursive Linear Search ==============");
        System.out.println("Search 6 in {1, 2, 3, 4, 6, 2, 3, 8} : " +
                LinearSearch.recursiveLinearSearch(List.of(1, 2, 3, 4, 6, 2, 3, 8), 6, 0));

        System.out.println("================== Binary Search ==============");
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        System.out.println("Search in {10, 22, 38, 49, 55, 61, 300, 834} : " +
                binarySearch.findElementBinarySearch(List.of(10, 22, 38, 39, 41, 45, 49, 51, 55, 61, 300, 834), 39));

        BinarySearch<String> binarySearchString = new BinarySearch<>();
        System.out.println("Search in {\"a\", \"bc\", \"de\", \"fg\", \"hi\", \"lm\"} : " +
                binarySearchString.findElementBinarySearch(List.of("a", "bc", "de", "fg", "hi", "lm"), "hi"));
    }
}
