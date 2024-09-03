package com.katalearn.fizzbuzzkata;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzbuzz = new FizzBuzz();
	
	@Test
	public void testGetFizzBuzzValue_inputNumIs0_returns0() {

		int input = 0;
		String result = fizzbuzz.getFizzBuzzValue(input);
		assertEquals("0", result);
	}
	
	@Test
	public void testGetFizzBuzzValue_inputNumIs1_returns1() {

		int input = 1;
		String result = fizzbuzz.getFizzBuzzValue(input);
		assertEquals("1", result);
	}

}
