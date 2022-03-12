package com.mt.datastrutures;

public class RecursionApp {
	public static void main(String[] args) {
		firstMethod();
		System.out.println("============== Recursive Method");
		recursiveMethod(4);
	}

	public static void firstMethod() {
		secondMethod();
		System.out.println("First Method");
	}

	public static void secondMethod() {
		thirdMethod();
		System.out.println("Second Method");
	}

	public static void thirdMethod() {
		System.out.println("Third Method");
	}

	public static void recursiveMethod(int n) {
		if (n < 1) {
			System.out.println("n is less than 1");
		} else {
			recursiveMethod(n - 1);
			System.out.println(n);
		}
	}
}
