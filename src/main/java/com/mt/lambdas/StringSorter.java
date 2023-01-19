package com.mt.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSorter {

	private List<String> strings;

	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}

	public List<String> naturalSort() {
		Collections.sort(this.strings);
		return strings;
	}

	public List<String> naturalSortWithStreams() {
		return strings.stream().sorted().toList();
	}

	public List<String> lengthSort() {
		strings.sort(Comparator.comparingInt(String::length));
		return strings;
	}

	public List<String> naturalSortWithStreamsSorted() {
		return strings.stream().sorted((Comparator.comparingInt(String::length))).toList();
	}
}
