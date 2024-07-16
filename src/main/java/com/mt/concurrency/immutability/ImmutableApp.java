package com.mt.concurrency.immutability;


public class ImmutableApp {

    public static void main(String[] args) {

        ComplexNumber complexNumber = ComplexNumber.createComplexNumber(1, 2);
        System.out.println(STR."\{complexNumber.getValue()}, address is: \{complexNumber}");

        ComplexNumber complexNumber1 = complexNumber.add(ComplexNumber.createComplexNumber(3, 4));
        System.out.println(STR."\{complexNumber1.getValue()}, address is: \{complexNumber1}");
    }
}
