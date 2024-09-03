package com.katalearn.fizzbuzzkata;

public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	public String getFizzBuzzValue(int num) {

		StringBuilder result = new StringBuilder();

		if (num == 0)
			return String.valueOf(num);

		if (isMultipleOf3(num))
			result.append(FIZZ);
		if (isMultipleOf5(num))
			result.append(BUZZ);

		return result.length() > 0 ? result.toString() : String.valueOf(num);
	}

	private boolean isMultipleOf5(int num) {
		return num % 5 == 0;
	}

	private boolean isMultipleOf3(int num) {
		return num % 3 == 0;
	}

}
