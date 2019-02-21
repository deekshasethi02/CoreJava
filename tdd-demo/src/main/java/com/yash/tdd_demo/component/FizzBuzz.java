package com.yash.tdd_demo.component;

public class FizzBuzz {

	public static String getAnswerFor(int number) {
		checkNumber(number);
		return computeNumber(number);

	}

	private static void checkNumber(int number) {
		if (number == 0) {
			throw new IllegalArgumentException("zero not allowed");
		}
	}

	private static String computeNumber(int number) {
		String answer = String.valueOf(number);

		if (isDivisbleByThree(number) && isDivisibleByFive(number)) {
			answer = "fizzbuzz";
		} else if (isDivisbleByThree(number)) {
			answer = "fizz";
		} else if (isDivisibleByFive(number)) {
			answer = "buzz";
		}
		return answer;
	}

	private static boolean isDivisibleByFive(int number) {
		return number % 5 == 0;
	}

	private static boolean isDivisbleByThree(int number) {
		return number % 3 == 0;
	}

}
