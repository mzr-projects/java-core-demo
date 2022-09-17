package com.mt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApp {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("this", "is", "list", "of", "strings");

		List<String> stringsFromStream = Stream.of("this", "is", "list", "of", "strings").toList();

		System.out.println("============ Joining in Uppercase");
		String joinUpperCase = stringsFromStream.stream().map(String::toUpperCase).collect(Collectors.joining());
		System.out.println(joinUpperCase);

		System.out.println("=========== Total length");
		int totalLength = stringsFromStream.stream().collect(Collectors.summingInt(String::length));
		System.out.println(totalLength);


		/*
		 * This is not what we want we must not change values inside lambdas because it has side effects
		 * */
		List<String> strings2 = new ArrayList<>();
		stringsFromStream.stream().filter(s -> s.length() % 2 == 0).forEach(strings2::add);

		/*
		 * This is what we want to do
		 * */
		List<String> string3 = stringsFromStream.stream().filter(s -> s.length() % 2 == 0).toList();
		System.out.println(string3);
	}
}
