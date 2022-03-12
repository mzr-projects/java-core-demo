package com.mt.inheritance.abstraction;

public class AbstractionApp {

	public static void main(String[] args) {
		TestClassFirst testClass = new TestClassFirst();
		testClass.implementMe();
		System.out.println(testClass.printOne());
		System.out.println(testClass.printTwo());
	}
}
