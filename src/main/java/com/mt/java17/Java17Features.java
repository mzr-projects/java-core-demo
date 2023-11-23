package com.mt.java17;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Java17Features {

    public static void main(String[] args) {

        /*
         * We cannot set var to null because it needs to know the reference type of it but with var its not possible
         * for compiler to know
         *
         * var n = null;
         * */

        /*
         * For lambda expressions we can not assign the result to a var because its a must for java compiler to know
         * about the TYPE of fn
         *         String s = "abc";
         *         var fn = ss -> s.length();
         * */

        /*
         * We can use var :
         * 1.    If the right hand side is a call to a constructor or a static factory method
         * 2.    If the scope and usage of the local variable is short and simple
         * 3.    If variables have names that already indicate their types
         * */

        var i = 2;
        System.out.println("var i = " + i);

        var lambdaFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 2;
            }
        };
        System.out.println("Function in var : " + lambdaFunction.apply("2"));

        var string = """
                select * from customers where name = 'MT'
                and id = 1
                """;
        System.out.println("Sql in string java 17 : " + string);

        /*
         * Records
         * */
        record Customer(Integer id, String name) {
        }
        var customer = new Customer(1, "Jimmy");
        System.out.println("Customer name is : " + customer.name + " ," + " Customer id is : " + customer.id);

        RecordSampleBase recordSampleBase1 = new RecordSampleBase("ME", 1);
        RecordSampleBase recordSampleBase2 = new RecordSampleBase("MET", 1);
        RecordSampleBase recordSampleBase3 = new RecordSampleBase("MTE", 11);
        RecordSample recordSample1 = new RecordSample(recordSampleBase1, "GG");
        RecordSample recordSample2 = new RecordSample(recordSampleBase2, "NT");
        RecordSample recordSample3 = new RecordSample(recordSampleBase3, "BG");

        Set<RecordSample> sampleSet = new HashSet<>();
        sampleSet.add(recordSample1);
        sampleSet.add(recordSample2);
        sampleSet.add(recordSample3);

        System.out.println("Records is set : " + sampleSet);

        MarketOrder marketOrder = new MarketOrder(1, LocalDateTime.now());
        LimitOrder limitOrder = new LimitOrder(5, 34.87, LocalDateTime.now());

        System.out.println(((Order) marketOrder).units());

        /*
         * Sealed Classes
         * */
        var shape = new Square();
        shape.identify();

        var shape2 = (Object) new Square();
        var myShape = (Shape) shape2;
        myShape.identify();

        var shapeObject = (Object) new Square();
        if (shapeObject instanceof Shape shapeTemp) {
            shapeTemp.identify();
        }

        Object o = "fgdsgsdg";
        var msg = switch (o) {
            case String ss -> ss + " is string";
            case Integer ii -> "Integer : " + ii;
            case null, default -> "Not String or Integer";
        };
        System.out.println(msg);
    }
}

/*
 * Here we defined what sub-types this shape interface is going to have (Circle,Rectangle)
 * */
sealed interface Shape permits Circle, Rectangle {
    default void identify() {
        System.out.println("I am a " + getClass().getName());
    }
}

sealed interface Rectangle extends Shape permits Square {

}

final class Square implements Rectangle {

}

final class Circle implements Shape {

}

record RecordSample(RecordSampleBase recordSampleBase, String address) {

}

record RecordSampleBase(String name, int age) {
    public RecordSampleBase {
        if (name.equals("MT")) {
            throw new IllegalArgumentException("Name must not be MT");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive number");
        }
    }
}

sealed interface Order permits MarketOrder, LimitOrder {
    int units();

    LocalDateTime sentAt();
}

record MarketOrder(int units, LocalDateTime sentAt) implements Order {

}

record LimitOrder(int units, double price, LocalDateTime sentAt) implements Order {

}
