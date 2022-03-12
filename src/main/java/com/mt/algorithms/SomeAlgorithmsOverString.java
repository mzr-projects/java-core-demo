package com.mt.algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SomeAlgorithmsOverString {
	public static void main(String[] args) {
		System.out.println("==================== Reverse String");
		System.out.println("Reverse of : " + reverseString("Hello"));

		System.out.println("==================== Number of characters in String");
		System.out.println("Number of characters in : 'Hey bro trust me goddamn it' : ");
		countNumberOfCharacters("Hey bro trust me goddamn it");
		if (areTwoStringsAnagrams("mymoan", "manmyo")) {
			System.out.println("Tow strings are anagram");
		} else {
			System.out.println("Tow strings are not anagram");
		}

		System.out.println("==================== First Non-Repeated Character");
		System.out.println(firstNonRepeatedCharacter("avcfcvda"));

		System.out.println("==================== String with Unique Characters");
		System.out.println(hasStringUniqueCharacter("abcdesw"));

		System.out.println("==================== Min Distance");
		System.out.println("Min distance is : " + minDistance("Anshuman", "Antihuman"));
		System.out.println("Min distance is : " + minDistance("abad", "abac"));
	}

	public static String reverseString(String s) {
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			reverse = s.charAt(i) + reverse;
		}
		return reverse;
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

	public static boolean areTwoStringsAnagrams(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		return countNumberOfCharacters(str1).equals(countNumberOfCharacters(str2));
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
}
