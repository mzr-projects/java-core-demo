package com.mt.java17;

import java.util.function.Function;

public class Java17Features {
    public static void main(String[] args) {

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

        record Customer(Integer id, String name) {
        }
        var customer = new Customer(1, "Jimmy");
        System.out.println("Customer name is : " + customer.name + " ," + " Customer id is : " + customer.id);

        var shape = new Square();
        shape.identify();

        var shape2 = (Object) new Square();
        if (shape2 instanceof Square) {
            var myShape = (Shape) shape2;
            myShape.identify();
        }

        var shapeObject = (Object) new Square();
        if (shapeObject instanceof Shape shapeTemp) {
            shapeTemp.identify();
        }
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