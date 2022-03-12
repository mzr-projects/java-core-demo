package com.mt.algorithms;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class FirstTest {
	private static Stack<String> stringStack = new Stack<>();
	private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

	public static void main(String[] args) {
		System.out.println("Result  : " + solution("4 5 6 - 7 +"));
		System.out.println("Result  : " + solution("13 DUP 4 POP 5 DUP + DUP + -"));
		System.out.println("Result  : " + solution("5 6 + -"));
		System.out.println("Result  : " + solution("3 DUP 5 - -"));
		System.out.println("Result  : " + solution("1048575 DUP +"));
	}

	public static int solution(String s) {
		stringStack.clear();
		String[] inputs = s.split("\\s+");

		for (String stackElement : inputs) {
			stringStack.push(stackElement);
		}

		int result = 0;
		for (String element : inputs) {
			if (isNumeric(element)) {
				stringStack.push(element);
			} else {
				switch (element) {
					case "+":
						//stringStack.pop();
						String first1 = stringStack.pop();
						String second1 = stringStack.pop();
						if (!isNumeric(first1) || !isNumeric(second1)) {
							return -1;
						}
						result = Integer.parseInt(first1) + Integer.parseInt(second1);
						stringStack.push(String.valueOf(result));
						break;
					case "-":
						//stringStack.pop();
						String first2 = stringStack.pop();
						String second2 = stringStack.pop();
						if (!isNumeric(first2) || !isNumeric(second2)) {
							return -1;
						}
						result = Integer.parseInt(first2) - Integer.parseInt(second2);
						stringStack.push(String.valueOf(result));
						break;
					case "POP":
						stringStack.pop();
						break;
					case "DUP":
						String dup = stringStack.pop();
						stringStack.push(dup);
						stringStack.push(dup);
						break;
				}
			}
		}
		return result;
	}

	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		return pattern.matcher(strNum).matches();
	}
}
