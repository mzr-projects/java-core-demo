package com.mt.advanced.memory;

import java.io.IOException;
import java.math.BigInteger;

/*
 * - Xmx : Maximum size of the java heap
 * -Xms: Initial size of the java heap
 * -Xss: Stack size of the java heap
 * */
public class GcApp {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();

        //System.out.println(f(40));
        //System.out.println("Time elapsed : " + (System.currentTimeMillis() - startTime) + "ms");

        //System.out.println(fBI(40));
        //System.out.println("Time elapsed : " + (System.currentTimeMillis() - startTime) + "ms");

        //System.out.println(fLong(40));
        //System.out.println("Time elapsed : " + (System.currentTimeMillis() - startTime) + "ms");

        //FibCache fibCache = new FibCache();
        //System.out.println(fibCache.fCache(40));
        //System.out.println("Time elapsed : " + (System.currentTimeMillis() - startTime) + "ms");

        //System.out.println(fibCache.fCacheInMethod(40, new HashMap<>()));
        //System.out.println("Time elapsed : " + (System.currentTimeMillis() - startTime) + "ms");

        System.out.println(fNonRecursive(40));
        System.out.println(STR."Time elapsed : \{System.currentTimeMillis() - startTime}ms");

    }

    private static String f(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(STR." \{n}");
        }

        if (n <= 1) {
            return STR."\{n}";
        }

        BigInteger b1 = new BigInteger(f(n - 1));
        BigInteger b2 = new BigInteger(f(n - 2));

        return b1.add(b2).toString();
    }

    private static BigInteger fBI(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(STR." \{n}");
        }

        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger b1 = fBI(n - 1);
        BigInteger b2 = fBI(n - 2);

        return b1.add(b2);
    }

    private static long fLong(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(STR." \{n}");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        long b1 = fLong(n - 1);
        long b2 = fLong(n - 2);

        return b1 + b2;
    }

    /*
     * Here we can even calculate 100_000 for n
     * But in recursive mode we can hardly reach to 1000 because of stack_overflow exception generated by
     * recursive solution
     * */
    private static String fNonRecursive(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(STR." \{n}");
        }

        BigInteger n0 = BigInteger.ZERO;
        BigInteger n1 = BigInteger.ONE;
        BigInteger temp;

        for (int i = 0; i <= n; i++) {
            temp = n1;
            n1 = n0.add(n1);
            n0 = temp;
        }

        return n0.toString();
    }
}
