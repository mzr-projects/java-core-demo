package com.mt.designPatterns.singleton;

public class SingletonBillPugh {

	private SingletonBillPugh() {

	}

	public static SingletonBillPugh getInstance() {
		return LazyHolder.INSTANCE;
	}

	private static class LazyHolder {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}
}
