package com.mt.designPatterns.structural.proxy;

public class RealObject implements Work {

	@Override
	public void doSomething() {
		System.out.println("Doing something in RealObject");
	}
}
