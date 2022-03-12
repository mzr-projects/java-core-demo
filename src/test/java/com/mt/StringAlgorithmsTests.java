package com.mt;


import com.mt.algorithms.SomeAlgorithmsOverArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class StringAlgorithmsTests {

	/**
	 * Rigorous Test :-)
	 */
	@Test
	void shouldAnswerWithTrue() {
		int nth = SomeAlgorithmsOverArray.findNthLargestElement(new int[]{4, 8, 10, 5, 2, 20, 12, 14}, 5);
		assertEquals(nth, 8);
	}

	@Test
	void distinctSequence() {
		int distNumber = SomeAlgorithmsOverArray.numDistinct("rabbbit", "rabbit");
		int distNumber_2 = SomeAlgorithmsOverArray.numDistinct("abc", "abc");
		assertEquals(distNumber, 3);
		assertEquals(distNumber_2, 1);
	}
}
