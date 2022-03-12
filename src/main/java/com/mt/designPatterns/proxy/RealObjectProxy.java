package com.mt.designPatterns.proxy;

public class RealObjectProxy extends RealObject {
	@Override
	public void doSomething() {
		System.out.println("Doing something in RealObjectProxy");
		super.doSomething();
	}
}
