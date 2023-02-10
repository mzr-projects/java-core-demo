package com.mt.designPatterns.structural.adapter;

public class StuffedEagle implements StuffedBird {

    @Override
    public void makeNoise() {
        System.out.println("Toy Eagle is making noise.");
    }
}
