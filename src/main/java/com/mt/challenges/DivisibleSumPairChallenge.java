package com.mt.challenges;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairChallenge {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 5, Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int numberOfPairs = 0;

        if ((n >= 2 && n <= 100) && (k >= 1 && k <= 100)) {
            for (int i = 0; i < ar.size(); i++) {
                for (int j = 0; j < ar.size(); j++) {
                    int temp = ar.get(i);
                    int sumTemp = temp + ar.get(j);
                    if (sumTemp % k == 0 && i < j) {
                        numberOfPairs++;
                    }
                }
            }
        }

        return numberOfPairs;
    }
}
