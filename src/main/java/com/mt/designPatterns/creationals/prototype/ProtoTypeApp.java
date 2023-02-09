package com.mt.designPatterns.creationals.prototype;

public class ProtoTypeApp {
    public static void main(String[] args) {
        try {
            String movie = PrototypeBuilder.getInstance(PrototypeBuilder.ModelType.MOVIE).toString();
            System.out.println(movie);

            String show = PrototypeBuilder.getInstance(PrototypeBuilder.ModelType.SHOW).toString();
            System.out.println(show);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
