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
	
	@Test
	public void testGetFizzBuzzValue_inputNumIs3_returnsFizz() {

		int input = 3;
		String result = fizzbuzz.getFizzBuzzValue(input);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void testGetFizzBuzzValue_inputNumIsMultipleOf3_returnsFizz() {

		int input = 12;
		String result = fizzbuzz.getFizzBuzzValue(input);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void testGetFizzBuzzValue_inputNumIs5_returnsBuzz() {

		int input = 5;
		String result = fizzbuzz.getFizzBuzzValue(input);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void testGetFizzBuzzValue_inputNumIsMultipleOf5_returnsBuzz() {

		int input = 50;
		String result = fizzbuzz.getFizzBuzzValue(input);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void testGetFizzBuzzValue_inputNumIsMultipleOf3And5_returnsFizzBuzz() {

		int input = 30;
		String result = fizzbuzz.getFizzBuzzValue(input);
		assertEquals("FizzBuzz", result);
	}

}
