package com.mt.inheritance.skeletal;

public class DringVending extends VendingService implements IVending {

	private static class AbstractVendingDelegator extends AbstractVending {
		@Override
		public void chooseProduct() {
			System.out.println("Choose a drink type.");
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
