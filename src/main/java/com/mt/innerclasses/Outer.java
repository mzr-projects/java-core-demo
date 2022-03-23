package com.mt.innerclasses;

public class Outer {

	private int age;
	private String name;

	public Outer(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * tatic inner class can not access non static attributes
	 */
	public static class innerStatic {
		public void innerStaticMethod() {
			System.out.println("Static inner class can not access non static attributes");
		}
	}

	/**
	 * Inner class has access to private attributes and methods of outer class
	 */
	private class PrivateInner {
		public void innerPrivateMethod() {
			System.out.println("Inner method access to outer class attributes, age : " + age + ", name :" + name);
		}
	}

	public class PublicInnerClass {
		public void innerPublicMethod() {
			System.out.println("Inner method access to outer class attributes, age : " + age + ", name :" + name);
		}
	}
}
