package com.mt.designpatterns.proxy;

public class RealObject implements Work{
	@Override
	public void doSomething() {
		System.out.println("Doing something in RealObject");
	}
}
