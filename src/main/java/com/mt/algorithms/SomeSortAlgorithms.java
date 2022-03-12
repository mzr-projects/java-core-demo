package com.mt.algorithms;

public class SomeSortAlgorithms {
	public static void main(String[] args) {
		int[] sortedArray = insertionSort(new int[]{4, 3, 1, 3, 7, 8, 5, 10});
		for (int j : sortedArray) {
			System.out.print(j + " ");
		}
	}

	public static int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int valueToCompare = array[i];
			int j;
			for (j = i; j > 0 && array[j - 1] > valueToCompare; j--) {
				array[j] = array[j - 1];
			}
			array[j] = valueToCompare;
			/*
			System.out.print("Iteration " + (i) + ": ");
			for (int k = 0; k < array.length; k++) {
				System.out.print(array[k] + " ");
			}
			System.out.println();
			*/
		}
		return array;
	}
}
