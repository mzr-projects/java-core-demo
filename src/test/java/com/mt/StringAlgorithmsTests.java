package com.mt;


import com.mt.algorithms.SomeAlgorithmsOverString;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
class StringAlgorithmsTests {

	@Test
	void reverseString() {
		String reversed = SomeAlgorithmsOverString.reverseString("Hello");
		assertEquals("olleH", reversed);
	}

	@Test
	void reverseSentence() {
		String reversedSentence = SomeAlgorithmsOverString.reverseSentence("Hi My name is Maziar");
		assertEquals("Maziar is name My Hi", reversedSentence);
	}

	@Test
	void countNumberOfCharacters() {
		Map<Character, Integer> cIMap = SomeAlgorithmsOverString.countNumberOfCharacters("Hello");
		Map<Character, Integer> ciMap_Expected = new HashMap<>();
		ciMap_Expected.put('H', 1);
		ciMap_Expected.put('e', 1);
		ciMap_Expected.put('o', 1);
		ciMap_Expected.put('l', 2);
		assertEquals(ciMap_Expected, cIMap);
	}

	@Test
	void anagrams() {
		boolean isAnagram = SomeAlgorithmsOverString.areTwoStringsAnagrams("mymoan", "manmyo");
		assertEquals(true, isAnagram);
	}

	@Test
	void firstNonRepeatedCharacter() {
		char actualChar = SomeAlgorithmsOverString.firstNonRepeatedCharacter("avcfcvda");
		assertEquals('f', actualChar);
	}

	@Test
	void hasStringUniqueCharacters() {
		assertTrue(SomeAlgorithmsOverString.hasStringUniqueCharacter("abcdesw"));
	}

	@Test
	void minDistance() {
		int minD_1 = SomeAlgorithmsOverString.minDistance("Anshuman", "Antihuman");
		assertEquals(2, minD_1);

		int minD_2 = SomeAlgorithmsOverString.minDistance("abad", "abac");
		assertEquals(1, minD_2);
	}
}
