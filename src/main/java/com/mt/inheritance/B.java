package com.mt.inheritance;

public class B extends A {

	private int size;

	public B(int size) {
		super(size);
		System.out.println("We are in B constructor");
		this.size = size;
	}

	public int increaseSize() {
		return size + 2;
	}

}
