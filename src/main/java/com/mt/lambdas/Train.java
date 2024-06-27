package com.mt.lambdas;

import java.util.function.Supplier;

public class Train {

    public static Train createTrain(Supplier<Train> supplier) {
        return supplier.get();
    }

    public static void paintBlue(Train train) {
        System.out.println("Painting blue");
    }

    public void repair() {
        System.out.println(STR."Repairing \{this}");
    }
}
