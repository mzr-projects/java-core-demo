package com.mt.immutability;

public final class ComplexNumber {

	private final Integer realPart;
	private final Integer imaginaryPart;

	private ComplexNumber(Integer realPart, Integer imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public static ComplexNumber createComplexNumber(Integer realPart, Integer imaginePart) {
		return new ComplexNumber(realPart, imaginePart);
	}

	public ComplexNumber add(ComplexNumber complexNumber) {
		return new ComplexNumber(realPart + complexNumber.realPart,
				imaginaryPart + complexNumber.imaginaryPart);
	}

	public String getValue() {
		return realPart + " + " + imaginaryPart + "i";
	}
}
