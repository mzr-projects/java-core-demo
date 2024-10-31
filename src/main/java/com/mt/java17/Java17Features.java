package com.mt.java17;

import com.mt.java17.records.*;
import com.mt.java17.sealed.Shape;
import com.mt.java17.sealed.Square;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

@Slf4j
public class Java17Features {

    public static void main(String[] args) {

        /*
         * We cannot set var to null because it needs to know the reference type of it but with var its not possible
         * for compiler to know
         *
         * var n = null;
         * */

        /*
         * For lambda expressions, we cannot assign the result to a var because its a must for java compiler to know
         * about the TYPE of fn
         *         String s = "abc";
         *         var fn = ss -> s.length();
         * */

        /*
         * We can use var:
         * 1.    If the right-hand side is a call to a constructor or a static factory method
         * 2.    If the scope and usage of the local variable is short and simple
         * 3.    If variables have names that already indicate their types
         * */

        var i = 2;
        log.info(STR."var i = \{i}");

        var lambdaFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 2;
            }
        };
        log.info(STR."Function in var : \{lambdaFunction.apply("2")}");

        var string = """
                select * from customers where name = 'MT'
                and id = 1
                """;
        log.info(STR."Sql in string java 17 : \{string}");

        /*
         * Records
         * */
        record Customer(Integer id, String name) {
        }
        var customer = new Customer(1, "Jimmy");
        log.info(STR."Customer name is : \{customer.name} , Customer id is : \{customer.id}");

        Set<RecordSample> sampleSet = getRecordSamples();

        log.info(STR."Records is set : \{sampleSet}");

        MarketOrder marketOrder = new MarketOrder(1, LocalDateTime.now());
        LimitOrder limitOrder = new LimitOrder(5, 34.87, LocalDateTime.now());

        log.info("Market order unit: {}", ((Order) marketOrder).units());
        log.info("Limit order unit: {}", limitOrder.units());

        /*
         * Sealed Classes
         * */
        var shape = new Square();
        shape.identify();

        var shape2 = (Object) new Square();
        var myShape = (Shape) shape2;
        myShape.identify();

        var shapeObject = (Object) new Square();
        Shape shapeTemp = (Shape) shapeObject;
        shapeTemp.identify();

        Object o = "It's a string";
        var msg = switch (o) {
            case String ss -> STR."\{ss} is string";
            case Integer ii -> STR."Integer : \{ii}";
            case null, default -> "Not String or Integer";
        };

        log.info(msg);
    }

    private static Set<RecordSample> getRecordSamples() {
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
        return sampleSet;
    }
}