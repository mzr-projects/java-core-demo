package com.mt.algorithms;

import java.util.*;

public class SomeAlgorithmsOverArray {
	public static void main(String[] args) {

	}

	public static List<Integer> smallestAndLargestNumbers(int[] array) {
		List<Integer> smallestAndLargest = new ArrayList<>();
		int smallest = array[0];
		int largest = array[1];

		for (int j : array) {
			if (j > largest) {
				largest = j;
			} else if (j < smallest) {
				smallest = j;
			}
		}

		smallestAndLargest.add(smallest);
		smallestAndLargest.add(largest);

		return smallestAndLargest;
	}

	public static int findSecondLargestNumberInTheArray(int array[]) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int element : array) {
			if (element > highest) {
				secondHighest = highest;
				highest = element;
			} else if (element > secondHighest && element != highest)
				secondHighest = element;
		}

		return secondHighest;
	}

	public static List<Integer> findOccurringOddNumbersOfTimes(int[] numbers) {
		List<Integer> oddOccurrences = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();

		for (Integer number : numbers) {
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			} else {
				map.put(number, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				oddOccurrences.add(entry.getKey());
			}
		}

		return oddOccurrences;
	}

	/**
	 * @param array [2,3,1,1,4] [2,3,4,1,4,6] [3,2,9,1,1,5,7,3,2] [3, 2, 1, 3, 1, 5, 7, 3, 2]
	 *
	 * @return 2
	 */
	public static int minJumps(int[] array) {
		int initialNumber = array[0];
		int result = 0;
		int maxIndex = 0;
		int tempMax = 0;
		int largest = Integer.MIN_VALUE;
		boolean noNeedToContinue = false;

		for (int i = 0; i < array.length; i = initialNumber + maxIndex) {

			if (initialNumber >= array.length - 1 - maxIndex) {
				result++;
				break;
			}

			for (int j = i + 1; j <= array[initialNumber + maxIndex]; j++) {
				if (array[initialNumber + maxIndex] > array.length - 1) {
					result++;
					noNeedToContinue = true;
					break;
				}
				if (array[j] > largest) {
					largest = array[j];
					tempMax = j;
				}
			}

			if (noNeedToContinue) {
				result++;
				break;
			}

			maxIndex = tempMax;
			result++;
			initialNumber = largest;

			if (initialNumber > array.length - 1 - maxIndex) {
				result++;
				break;
			}

			if (initialNumber + maxIndex == array.length - 1) {
				result++;
				break;
			}

			largest = Integer.MIN_VALUE;
		}

		return result;
	}

	public static int longestConsecutive(int[] array) {
		Set<Integer> numbers = new HashSet<>();
		int longestLength = 0;

		for (int j : array) {
			numbers.add(j);
		}

		for (int element : array) {
			if (!numbers.contains(element - 1)) {
				int currentLength = 1;
				int currentElement = element;

				while (numbers.contains(currentElement + 1)) {
					currentLength++;
					currentElement++;
				}

				longestLength = Math.max(currentLength, longestLength);
			}
		}

		return longestLength;
	}

	public static int findNthLargestElement(int[] array, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

		for (int element : array) {
			if (pq.size() < n) {
				pq.add(element);
			} else {
				if (pq.peek() != null)
					if (pq.peek() < element) {
						pq.remove();
						pq.add(element);
					}
			}
		}

		return pq.peek();
	}

	public static int numDistinct(String str1, String str2) {
		int seqNumber = 0;

		if (str1.toLowerCase(Locale.ROOT).equals(str2.toLowerCase(Locale.ROOT))) {
			return 1;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				String result = str1.substring(0, i) + str1.substring(i + 1);
				if (result.equals(str2)) {
					seqNumber++;
				}
			}
		}

		return seqNumber;
	}

	public static Set<Integer> findLeadersInArray(int[] array) {
		Set<Integer> leaders = new HashSet<>();
		int lastElementIsLeader = array[array.length - 1];

		leaders.add(lastElementIsLeader);

		for (int i = array.length - 2; i > 0; i--) {
			if (array[i] > lastElementIsLeader) {
				lastElementIsLeader = array[i];
				leaders.add(array[i]);
			}
		}

		return leaders;
	}

	public static Set<Integer> intersectionOfTwoUnsortedArrays(int[] a, int[] b) {
		Set<Integer> interSection = new HashSet<>();
		Set<Integer> firstSet = new HashSet<>();
		Set<Integer> secondSet = new HashSet<>();

		for (int element : a) {
			firstSet.add(element);
		}

		for (int element : b) {
			secondSet.add(element);
		}

		if (a.length > b.length) {
			for (int element : a) {
				if (secondSet.contains(element)) {
					interSection.add(element);
				}
			}
		} else {
			for (int element : b) {
				if (firstSet.contains(element)) {
					interSection.add(element);
				}
			}
		}

		return interSection;
	}

	public static int tankCapacity(int[] array) {

		int maxArea = 0;
		int indexFromStart = 0;
		int indexFromEnd = array.length - 1;

		while (indexFromStart < indexFromEnd) {
			int currentArea = (indexFromEnd - indexFromStart) * Math.min(array[indexFromStart], array[indexFromEnd]);
			maxArea = Math.max(currentArea, maxArea);
			if (array[indexFromStart] < array[indexFromEnd]) {
				indexFromStart++;
			} else {
				indexFromEnd--;
			}
		}

		return maxArea;
	}
}
