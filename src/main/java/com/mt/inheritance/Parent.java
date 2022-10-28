package com.mt.inheritance;

public class Parent {

	private final int size;

	public Parent(int size) {
		System.out.println("We are in Parent constructor");
		this.size = size;
	}

	public int increaseSize() {
		return size + 1;
	}

	public void compute(int a) {
		System.out.println("compute(int a)");
	}

	public void compute(int a, int b) {
		System.out.println("compute(int a,int b");
	}

	public void compute(int a, double b) {
		System.out.println("compute(int a, double b)");
	}
}
