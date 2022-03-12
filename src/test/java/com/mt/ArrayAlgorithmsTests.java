package com.mt;


import com.mt.algorithms.SomeAlgorithmsOverArray;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for Array Algorithms.
 */
class ArrayAlgorithmsTests {

	@Test
	void nThLargestElement() {
		System.out.println("====================== Nth Largest Element Tests");

		int nth = SomeAlgorithmsOverArray.findNthLargestElement(new int[]{4, 8, 10, 5, 2, 20, 12, 14}, 5);
		assertEquals(nth, 8);
	}

	@Test
	void distinctSequence() {
		System.out.println("====================== Distinct Sequences Tests");

		int distNumber_1 = SomeAlgorithmsOverArray.numDistinct("rabbbit", "rabbit");
		int distNumber_2 = SomeAlgorithmsOverArray.numDistinct("abc", "abc");
		assertEquals(distNumber_1, 3);
		assertEquals(distNumber_2, 1);
	}

	@Test
	void minJumps() {
		System.out.println("====================== Min Jumps Tests");

		int minJumps_1 = SomeAlgorithmsOverArray.minJumps(new int[]{2, 1, 1});
		assertEquals(minJumps_1, 1);

		int minJumps_2 = SomeAlgorithmsOverArray.minJumps(new int[]{2, 3, 1, 1, 4});
		assertEquals(minJumps_2, 2);

		int minJumps_3 = SomeAlgorithmsOverArray.minJumps(new int[]{2, 3, 4, 1, 4, 6});
		assertEquals(minJumps_3, 2);

		int minJumps_4 = SomeAlgorithmsOverArray.minJumps(new int[]{3, 2, 1, 3, 1, 5, 7, 3, 2});
		assertEquals(minJumps_4, 3);
	}

	@Test
	void longestConsecutive() {
		System.out.println("====================== Longest Consecutive Tests");

		int longestConsecutive = SomeAlgorithmsOverArray.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2, 300, 5});
		assertEquals(longestConsecutive, 5);
	}

	@Test
	void oddOccurrenceOfNumber() {
		System.out.println("====================== Find the number occurring odd number of times");

		List<Integer> oddOccurrence = SomeAlgorithmsOverArray
				.findOccurringOddNumbersOfTimes(new int[]{1, 2, 3, 3, 2, 2, 1, 2, 5, 6, 1, 7, 7});
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(5);
		expected.add(6);
		assertEquals(oddOccurrence, expected);
	}

	@Test
	void secondLargestNumber() {
		System.out.println("====================== Second Highest Number");

		int secondLargestNumber = SomeAlgorithmsOverArray
				.findSecondLargestNumberInTheArray(new int[]{7, 5, 6, 4, 2, 1, 3});
		assertEquals(secondLargestNumber, 6);
	}

	@Test
	void findSmallestAndLargestNumbers() {
		System.out.println("====================== Find Smallest and Largest Number Tests");

		List<Integer> smallestNumber = SomeAlgorithmsOverArray.smallestAndLargestNumbers(new int[]{10, 20, 30, 4, 3, 2});
		List<Integer> expected = new ArrayList<>();
		expected.add(2);
		expected.add(30);

		assertEquals(smallestNumber, expected);
	}

	@Test
	void findLeaders() {
		System.out.println("====================== Find Leaders");

		Set<Integer> leaders_1 = SomeAlgorithmsOverArray.findLeadersInArray(new int[]{16, 17, 4, 3, 5, 2});
		Set<Integer> expected_1 = new HashSet<>();
		expected_1.add(17);
		expected_1.add(5);
		expected_1.add(2);
		assertEquals(leaders_1, expected_1);

		Set<Integer> leaders_2 = SomeAlgorithmsOverArray.findLeadersInArray(new int[]{1, 2, 3, 4, 5, 6});
		Set<Integer> expected_2 = new HashSet<>();
		expected_2.add(6);
		assertEquals(leaders_2, expected_2);

	}

	@Test
	void intersectionOfTwoUnsortedArrays() {
		System.out.println("====================== Intersection of Two Arrays");

		Set<Integer> interSection = SomeAlgorithmsOverArray
				.intersectionOfTwoUnsortedArrays(new int[]{3, 4, 6, 2, 8, 5, 9}, new int[]{6, 3, 2, 7, 5, 1});
		Set<Integer> expected = new HashSet<>();
		expected.add(3);
		expected.add(6);
		expected.add(2);
		expected.add(5);

		assertEquals(interSection, expected);
	}

	@Test
	void tankCapacity() {
		System.out.println("====================== Tank Capacity");

		int tankCapacity = SomeAlgorithmsOverArray.tankCapacity(new int[]{1, 5, 6, 3, 4, 2});
		assertEquals(tankCapacity, 12);
	}
}
