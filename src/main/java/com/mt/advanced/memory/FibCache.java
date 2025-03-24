package com.mt.advanced.memory;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibCache {

    private final Map<Integer, String> cache = new HashMap<>();

    public Map<Integer, String> getCache() {
        return cache;
    }

    public String fCache(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(STR." \{n}");
        }

        if (n <= 1) {
            return STR."\{n}";
        }

        String result = cache.get(n);
        if (result == null) {
            cache.put(n, result = new BigInteger(fCache(n - 1)).add(new BigInteger(fCache(n - 2))).toString());
        }

        return result;
    }

    public String fCacheInMethod(int n, Map<Integer, String> cache) {

        if (n < 0) {
            throw new IllegalArgumentException(STR." \{n}");
        }

        if (n <= 1) {
            return STR."\{n}";
        }

        String result = cache.get(n);
        if (result == null) {
            cache.put(n, result = new BigInteger(fCacheInMethod(n - 1, cache))
                    .add(new BigInteger(fCacheInMethod(n - 2, cache)))
                    .toString());
        }

        return result;
    }
}