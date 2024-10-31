package com.mt.performance;

import java.time.Clock;
import java.time.Instant;

public class CacheLineApp {

    public static void main(String[] args) {

        int[] array = new int[64 * 1024 * 1024];
        int k = 1;

        for (int i = 0; i < array.length; i += k) {
            long initTime = getNanoTime();
            array[i] *= 3;
            k = k * 2;
            System.out.println(STR."k: \{k}, Time taken: \{getNanoTime() - initTime}");
        }
    }

    private static long getNanoTime() {
        Clock clock = Clock.systemDefaultZone();
        Instant instant = clock.instant();
        return instant.getNano();
    }
}
