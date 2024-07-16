package com.mt.concurrency.immutability;

import net.jcip.annotations.Immutable;
import net.jcip.annotations.ThreadSafe;

/*
 * 1. Cannot change the state after construction
 * 2. All its fields are final
 * */
@Immutable
@ThreadSafe
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
        return STR."\{realPart} + \{imaginaryPart}i";
    }
}
