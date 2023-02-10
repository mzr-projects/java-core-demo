package com.mt.designPatterns.structural.adapter;

public class AdaptorApp {

    public static void main(String[] args) {

        Bird eagle = new Eagle();
        StuffedBird stuffedBird = new StuffedEagle();

        /*
         * Now we're using adaptor to adapt eagle to a StuffedBird
         * */
        StuffedBird newEagle = new BirdAdapter(eagle);

        System.out.println("Eagle ....");
        eagle.fly();
        eagle.makeSound();

        System.out.println("StuffedBird ....");
        stuffedBird.makeNoise();

        System.out.println("StuffedBird from BirdAdaptor ....");
        newEagle.makeNoise();
    }
}
