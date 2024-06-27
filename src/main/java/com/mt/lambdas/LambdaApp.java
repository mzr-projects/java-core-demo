package com.mt.lambdas;

import org.apache.commons.lang3.stream.Streams;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class LambdaApp {

    /*
     * #Anonymous classes can implement multiple methods, but in lambda we have only on abstract method
     * #Anonymous classes can extend another class
     * */
    public static void main(String[] args) {
        LambdaApp lambdaApp = new LambdaApp();

        System.out.println(STR."LambdaApp = \{lambdaApp}");

        lambdaApp.foo();

        /*
         * In this for we created two runnable with anonymous class and lambda
         * 1. In anonymous class, we're going to have a different object every round.
         * 2. Lambda version every time in the for loop will create the same object of r2.
         * 3. But if we add r1 to the output, the lambda will create a new object
         * each iteration causes we are referring to a local variable in the for loop.
         * */
        for (int i = 0; i < 3; i++) {
            Runnable r1 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hello World");
                }
            };
            System.out.println(STR."r1 = \{r1}");

            //Runnable r2 = () -> System.out.println("Hello World");
            Runnable r2 = () -> System.out.println(STR."Hello World \{r1}");
            System.out.println(STR."r2 = \{r2}");
        }

        /*
         * Here in the output we're going to get an object which implements serializable as well
         * */
        Runnable r3 = (Runnable & Serializable & Cloneable) () -> System.out.println("Hello World");
        System.out.println(Arrays.toString(r3.getClass().getInterfaces()));

        System.out.println("============== Train-Passenger");
        Train train = Train.createTrain(Train::new);
        List<Train> trains = Streams.of(train).toList();
        trains.forEach(Train::paintBlue);
        trains.forEach(Train::repair);
    }

    /*
     * If its lambda "this" refers to the en-closed object, but if its anonymous class it refers to the anonymous class
     * itself as we can see in the output, the LambdaApp is equal to the lJob.
     * */
    private void foo() {
        Runnable job = new Runnable() {
            public void run() {
                System.out.println(STR."job in \{this}");
            }
        };
        job.run();

        Runnable lJob = () -> System.out.println(STR."ljob in \{this}");
        lJob.run();
    }
}
