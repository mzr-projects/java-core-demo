package com.mt.designPatterns.creationals.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeBuilder {

    public static class ModelType {
        public static final String SHOW = "show";
        public static final String MOVIE = "movie";
    }

    private static final Map<String, IPrototype> prototypeMap = new HashMap<>();

    static {
        prototypeMap.put(ModelType.SHOW, new Show("Late Shows"));
        prototypeMap.put(ModelType.MOVIE, new Movie("Drama"));
    }

    public static IPrototype getInstance(final String s) throws CloneNotSupportedException {
        return prototypeMap.get(s).clone();
    }
}
