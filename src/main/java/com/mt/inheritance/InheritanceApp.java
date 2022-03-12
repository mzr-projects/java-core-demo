package com.mt.inheritance;

public class InheritanceApp {

	public static void main(String[] args) {

		System.out.println("========================= A");
		A a = new A(4);
		System.out.println("a.increaseSize() : " + a.increaseSize());

		System.out.println("========================= B");
		B b = new B(5);
		System.out.println("b.increaseSize() : " + b.increaseSize());
	}
}
