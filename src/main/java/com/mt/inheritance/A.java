package com.mt.inheritance;

public class A {

	private int size;

	public A(int size) {
		System.out.println("We are in A constructor");
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
