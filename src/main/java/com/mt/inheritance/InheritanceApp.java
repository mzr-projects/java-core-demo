package com.mt.inheritance;

public class InheritanceApp {

	public static void main(String[] args) {

		System.out.println("========================= A");
		Parent parent = new Parent(4);
		System.out.println("a.increaseSize() : " + parent.increaseSize());

		System.out.println("========================= B");
		Child child = new Child(5);
		System.out.println("b.increaseSize() : " + child.increaseSize());
	}
}
