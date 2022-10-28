package com.mt.basics;

public class BasicsInJava {
	public static void main(String[] args) {
		System.out.println("In JAVA" + 100 + 100);


	}

	private static class TestException extends RuntimeException{
		@Override
		public String getMessage() {
			return super.getMessage();
		}
	}
}
