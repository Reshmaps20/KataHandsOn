package com.katalearn.fizzbuzzkata;

public class FizzBuzz {

	public String getFizzBuzzValue(int num) {

		if (num == 0)
			return String.valueOf(num);
		if (num % 3 == 0 && num % 5 == 0)
			return "FizzBuzz";
		if (num % 3 == 0)
			return "Fizz";
		if (num % 5 == 0)
			return "Buzz";
		return String.valueOf(num);
	}

}
