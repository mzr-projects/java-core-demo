package com.mt.algorithms;

import java.util.*;

public class SomeAlgorithmsOverString {
	public static void main(String[] args) {
		// TODO document why this method is empty
	}

	public static boolean areTwoStringsAnagrams(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		return countNumberOfCharacters(str1).equals(countNumberOfCharacters(str2));
	}

	public static Map<Character, Integer> countNumberOfCharacters(String s) {
		Map<Character, Integer> numberOfCharacters = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				if (numberOfCharacters.containsKey(s.charAt(i)))
					numberOfCharacters.put(s.charAt(i), numberOfCharacters.get(s.charAt(i)) + 1);
				else
					numberOfCharacters.put(s.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : numberOfCharacters.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		return numberOfCharacters;
	}

	public static char firstNonRepeatedCharacter(String str) {
		Map<Character, Integer> characterCounts = new LinkedHashMap<>();

		for (Character ch : str.toCharArray()) {
			if (characterCounts.containsKey(ch)) {
				characterCounts.put(ch, characterCounts.get(ch) + 1);
			} else {
				characterCounts.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return ' ';
	}

	public static boolean hasStringUniqueCharacter(String str) {
		Map<Character, Integer> characterIntegerMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (characterIntegerMap.containsKey(str.charAt(i))) {
				return false;
			} else {
				characterIntegerMap.put(str.charAt(i), 1);
			}
		}

		return true;
	}

	public static int minDistance(String a, String b) {
		Map<Integer, Character> firstString = new HashMap<>();
		Map<Integer, Character> secondString = new HashMap<>();
		Map<Integer, Character> differences = new HashMap<>();

		if (a.length() >= 1 && b.length() <= 450) {

			for (int i = 0; i < a.length(); i++) {
				firstString.put(i, a.charAt(i));
			}

			for (int j = 0; j < b.length(); j++) {
				secondString.put(j, b.charAt(j));
			}

			differences.putAll(firstString);
			differences.putAll(secondString);

			if (a.length() > b.length()) {
				differences.values().removeAll(secondString.values());
			} else {
				differences.values().removeAll(firstString.values());
			}

			return differences.size();
		} else {
			return -1;
		}
	}

	public static String reverseString(String str) {
		StringBuilder reverse = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			reverse.insert(0, str.charAt(i));
		}
		return reverse.toString();
	}

	public static String reverseSentence(String str) {
		String[] words = str.split(" ");
		List<String> reversed = new ArrayList<>();

		for (int i = words.length - 1; i >= 0; i--) {
			reversed.add(words[i]);
		}

		return String.join(" ", reversed);
	}
}
