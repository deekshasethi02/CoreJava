package com.yash.tdd_demo.component;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private static final String SINGLE_VALUE_INPUT_AS_STRING="10";
	private static final int RESULT = 10;
	private StringCalculator stringCalculator;
	
	
	@Before
	public void setUp() {
		 stringCalculator = new StringCalculator();
		 System.out.println("----setup----"+stringCalculator);
	}
	
	
	@Test
	public void testAdd_GivenEmptyString_ReturnsZero() throws Exception {
		//StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.add("");
		assertEquals(0, result);
	}

	// @Test
	// public void testAdd_Given0neInString_ReturnsOneAsDigit() throws Exception {
	// StringCalculator stringCalculator = new StringCalculator();
	// int result = stringCalculator.add("1");
	// assertEquals(1, result);
	// }
	// @Test
	// public void testAdd_GivenTwoInString_ReturnsTwoAsDigit() throws Exception {
	// StringCalculator stringCalculator = new StringCalculator();
	// int result = stringCalculator.add("2");
	// assertEquals(2, result);
	// }

	@Test
	public void testAdd_GivenSingleNumberAsString_ReturnsSameNumberAsDigit() throws Exception {
		//StringCalculator stringCalculator = new StringCalculator();
		
		int result = stringCalculator.add(SINGLE_VALUE_INPUT_AS_STRING);
		assertEquals(RESULT, result);
	}
	@Test
	public void testAdd_GivenTwoNumberAsStringSeparatedByComma_ReturnsSumOfNumberAsDigit() throws Exception {
		int result = stringCalculator.add("10,20");
		assertEquals(30, result);
	}
	@Test
	public void testAdd_GivenNumberAsStringSeparatedByComma_ReturnsSumOfNumberAsDigit() throws Exception {
		int result = stringCalculator.add("10,20,30");
		assertEquals(60, result);
	}
}
