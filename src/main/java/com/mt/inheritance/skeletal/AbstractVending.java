package com.mt.inheritance.skeletal;

public abstract class AbstractVending implements IVending {
	@Override
	public void start() {
		System.out.println("Start vending machine");
	}

	@Override
	public void stop() {
		System.out.println("Stop vending machine");
	}

	@Override
	public void process() {
		start();
		chooseProduct();
		stop();
	}
}
