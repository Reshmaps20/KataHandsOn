package com.katalearn.fizzbuzzkata;

public class FizzBuzz {

	public String getFizzBuzzValue(int num) {

		if(num==0) return String.valueOf(num);
		if(num%3 == 0) return "Fizz";
		return String.valueOf(num);
	}

}
