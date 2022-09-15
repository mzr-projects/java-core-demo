package com.mt.immutability;

public class ImmutableApp {
	public static void main(String[] args) {

		ComplexNumber complexNumber = ComplexNumber.createComplexNumber(1, 2);
		System.out.println(complexNumber.getValue());

		ComplexNumber complexNumber1 = complexNumber.add(ComplexNumber.createComplexNumber(3, 4));
		System.out.println(complexNumber1.getValue());
	}
}
