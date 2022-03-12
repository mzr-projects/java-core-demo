package com.mt.algorithms;

/**
 * Hello world!
 */
public class SecondTest {

	public static void main(String[] args) {
		System.out.println("Result : " + solution("23"));
		System.out.println("Result : " + solution("0081"));
		System.out.println("Result : " + solution("022"));
	}

	public static int solution(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); ++i) {
			sum += s.charAt(i) - 48;
		}

		int count = 0;
		if (sum % 3 == 0) {
			count = 1;
		}

		for (int i = 0; i < s.length(); ++i) {

			int remaining = sum - (s.charAt(i) - 48);
			for (int j = 0; j <= 9; ++j) {
				if ((remaining + j) % 3 == 0 && j != s.charAt(i) - 48) {
					++count;
				}
			}
		}
		return count;
	}
}
