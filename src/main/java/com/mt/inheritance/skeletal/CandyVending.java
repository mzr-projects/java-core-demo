package com.mt.inheritance.skeletal;

import com.mt.inheritance.A;

public class CandyVending implements IVending {

	private static class AbstractVendingDelegator extends AbstractVending {
		@Override
		public void chooseProduct() {
			System.out.println("Choose a type of candy.");
		}
	}

	AbstractVendingDelegator abstractVendingDelegator = new AbstractVendingDelegator();

	@Override
	public void start() {
		abstractVendingDelegator.start();
	}

	@Override
	public void chooseProduct() {
		abstractVendingDelegator.chooseProduct();
	}

	@Override
	public void stop() {
		abstractVendingDelegator.stop();
	}

	@Override
	public void process() {
		abstractVendingDelegator.process();
	}
}
