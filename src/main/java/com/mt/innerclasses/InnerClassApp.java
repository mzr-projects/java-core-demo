package com.mt.innerclasses;

public class InnerClassApp {
	public static void main(String[] args) {
		Outer.PublicInnerClass publicInnerClass = new Outer(1, "BRO").new PublicInnerClass();
		publicInnerClass.innerPublicMethod();
		new Outer.innerStatic().innerStaticMethod();
	}
}
