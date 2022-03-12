package com.mt.threads;

public class ThreadApp {
	public static void main(String[] args) {
		TestThreadWithExtending thread1 = new TestThreadWithExtending();
		thread1.start();

		Runnable runnable = () -> {
			System.out.println("We are in Runnable");
		};
		Thread thread2 = new Thread(runnable);
		thread2.start();
	}
}
