package com.katalearn.fizzbuzzkata;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testGetFizzBuzzValue_inputNumIs0_returns0() {

		int input = 0;
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.getFizzBuzzValue(input);
		assertEquals("0", result);
	}

}
