package com.mt.inheritance.abstraction;

public interface FirstInterfaceClass {
	void implementMe();

	default String printOne() {
		return "Print One";
	}
}
