package com.mt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsApp {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("this", "is", "list", "of", "strings", "this1", "is1", "list1", "of1",
                "strings1");

        List<String> stringsFromStream = Stream.of("this", "is", "list", "of", "strings").toList();

        System.out.println(StreamDemoUtils.mapToUppercase(stringsFromStream));
        System.out.println(StreamDemoUtils.summation(stringsFromStream));

        /*
         * This is not what we want we must not change values inside lambdas because it has side effects
         * */
        List<String> strings2 = new ArrayList<>();
        stringsFromStream.stream().filter(s -> s.length() % 2 == 0).forEach(strings2::add);

        /*
         * This is what we want to do
         * */
        StreamDemoUtils.filterData(stringsFromStream);

        /*
         * Parallel Processing
         * */
        StreamDemoUtils.parallelProcessing(stringList);

        System.out.println("Largest number : " +
                StreamDemoUtils.findTheLargestNumber(Arrays.asList(1L, 4L, 2L, 7L, 12L, 3L, 54L, 2L)));
    }
}
