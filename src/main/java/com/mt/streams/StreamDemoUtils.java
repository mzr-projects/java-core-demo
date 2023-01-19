package com.mt.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemoUtils {

    private StreamDemoUtils() {

    }

    public static String mapToUppercase(List<String> stringsFromStream) {
        return stringsFromStream.stream().map(String::toUpperCase).collect(Collectors.joining());
    }

    public static int summation(List<String> stringsFromStream) {
        return stringsFromStream.stream().mapToInt(String::length).sum();
    }

    public static void filterData(List<String> stringsFromStream) {
        stringsFromStream.stream().filter(s -> s.length() % 2 == 0).toList().forEach(System.out::println);
    }

    public static Long findTheLargestNumber(List<Long> longList) {
        Optional<Long> value = longList.stream().max(Comparator.naturalOrder()).stream().findFirst();
        return value.orElseGet(() -> value.orElse(null));
    }

    public static void parallelProcessing(List<String> strings) {
        strings.stream().map(String::toUpperCase).parallel().forEach(System.out::println);
    }
}
