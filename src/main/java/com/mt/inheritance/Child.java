package com.mt.inheritance;

public class Child extends Parent {

	private final int size;

	public Child(int size) {
		super(size);
		System.out.println("We are in Child constructor");
		this.size = size;
	}

	public int increaseSize() {
		return size + 2;
	}

}
