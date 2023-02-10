package com.mt.designPatterns.structural.adapter;

public class BirdAdapter implements StuffedBird {

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    /*
     * Here we adapt makeSound of the real Bird to makeNoise of the StuffedBird
     * Here the bird can makeNoise like a StuffedBird 😁
     * */
    @Override
    public void makeNoise() {
        bird.makeSound();
    }
}
