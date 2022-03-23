package com.mt.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaApp {
	public static void main(String[] args) {
		StringSorter stringSorter = new StringSorter();
		List<String> strings = Arrays.asList("Holy Moly", "James", "What the fuck is this ?", "TT");
		stringSorter.setStrings(strings);
		System.out.println(stringSorter.lengthSort());

		System.out.println("============== Stream Definition");
		Stream.of(3, 1, 4, 2, 6, 7).forEach(n -> System.out.println(n));

		System.out.println("============= Consumer Definition");
		Consumer<Integer> printer = n -> System.out.println(n);
		Stream.of(3, 1, 4, 2, 6, 7).forEach(printer);

		System.out.println("============ Predicate % 3");
		Predicate<Integer> integerPredicate = n -> n % 3 == 0;
		Stream.of(3, 2, 1, 4, 6, 7, 8, 9, 21).filter(integerPredicate).forEach(System.out::println);
	}
}
