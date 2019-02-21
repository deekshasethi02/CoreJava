package com.yash.tdd_demo.component;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void testGetAnswerFor_Given1AsNumber_ShouldReturn1AsString() throws Exception {
		String result = FizzBuzz.getAnswerFor(1);
		assertEquals("1", result);

	}

	@Test
	public void testGetAnswerFor_Given2AsNumber_ShouldReturn2AsString() throws Exception {
		String result = FizzBuzz.getAnswerFor(2);
		assertEquals("2", result);

	}
	@Test
	public void testGetAnswerFor_Given3AsNumber_ShouldReturnFizz() throws Exception {
		String result = FizzBuzz.getAnswerFor(3);
		assertEquals("fizz", result);

	}
	@Test
	public void testGetAnswerFor_Given4AsNumber_ShouldReturn4() throws Exception {
		String result = FizzBuzz.getAnswerFor(4);
		assertEquals("4", result);

	}
	@Test
	public void testGetAnswerFor_Given5AsNumber_ShouldReturnBuzz() throws Exception {
		String result = FizzBuzz.getAnswerFor(5);
		assertEquals("buzz", result);
	}
	@Test
	public void testGetAnswerFor_Given6AsNumber_ShouldReturnFizz() throws Exception {
		String result = FizzBuzz.getAnswerFor(6);
		assertEquals("fizz", result);

	}
	@Test
	public void testGetAnswerFor_Given7AsNumber_ShouldReturn7AsString() throws Exception {
		String result = FizzBuzz.getAnswerFor(7);
		assertEquals("7", result);

	}
	@Test
	public void testGetAnswerFor_Given15AsNumber_ShouldReturnFizzBuzz() throws Exception {
		String result = FizzBuzz.getAnswerFor(15);
		assertEquals("fizzbuzz", result);

	}
	@Test(expected = IllegalArgumentException.class)
	public void testGetAnswerFor_Given0AsNumber_ShouldReturnException() throws Exception {
		String result = FizzBuzz.getAnswerFor(0);
		

	}
	
}
