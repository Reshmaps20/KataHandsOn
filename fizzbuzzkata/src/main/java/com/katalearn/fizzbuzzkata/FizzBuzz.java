package com.katalearn.fizzbuzzkata;

public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	public String getFizzBuzzValue(int num) {

		if (num == 0)
			return String.valueOf(num);

		String result = (isMultipleOf3(num) ? FIZZ : "") + (isMultipleOf5(num) ? BUZZ : "");

		return result.length() > 0 ? result : String.valueOf(num);
	}

	private boolean isMultipleOf5(int num) {
		return num % 5 == 0;
	}

	private boolean isMultipleOf3(int num) {
		return num % 3 == 0;
	}

}
