package com.mt.lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {
	public static void main(String[] args) {
		StringSorter stringSorter = new StringSorter();
		List<String> strings = Arrays.asList("Holy Noly", "James", "What the fuck is this ?", "TT");
		stringSorter.setStrings(strings);
		System.out.println(stringSorter.lengthSort());
	}
}
