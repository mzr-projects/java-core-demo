package com.mt.innerclasses;

public class InnerClassApp {
    public static void main(String[] args) {

        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        innerStaticClass.innerStaticMethod();

        OuterClass outerClass = new OuterClass(1, "BRO");
        OuterClass.PublicInnerClass publicInnerClass = outerClass.new PublicInnerClass();
        publicInnerClass.setName("James");
        publicInnerClass.innerPublicMethod("Jimmy");
    }
}
