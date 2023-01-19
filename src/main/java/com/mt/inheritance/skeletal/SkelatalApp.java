package com.mt.inheritance.skeletal;

public class SkelatalApp {
	public static void main(String[] args) {
		IVending candy = new CandyVending();
		IVending drink = new DringVending();

		candy.process();
		System.out.println("======================");
		drink.process();

		System.out.println("======================");
		VendingService vs = (VendingService) drink;
		vs.service();
	}
}
