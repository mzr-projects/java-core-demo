package com.mt.threads;

public class TestThreadWithImplementing implements Runnable {

	@Override
	public void run() {
		System.out.println("implements Runnable");
	}
}
