package com.yash.tdd_demo.component;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class PrimeFactorTest {
	@Test
	public void testComputeFactorFor_Given1AsNumber_ShouldReturnEmptyList() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(1);
		assertEquals(Collections.emptyList(), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given2AsNumber_ShouldReturn2() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(2);
		assertEquals(Arrays.asList(2), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given3AsNumber_ShouldReturn3() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(3);
		assertEquals(Arrays.asList(3), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given4AsNumber_ShouldReturn2times2() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(4);
		assertEquals(Arrays.asList(2, 2), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given5AsNumber_ShouldReturn5() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(5);
		assertEquals(Arrays.asList(5), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given6AsNumber_ShouldReturn2And3() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(6);
		assertEquals(Arrays.asList(2, 3), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given7AsNumber_ShouldReturn7() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(7);
		assertEquals(Arrays.asList(7), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given8AsNumber_ShouldReturn3Times2() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(8);
		assertEquals(Arrays.asList(2, 2, 2), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given9AsNumber_ShouldReturn2Times3() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(9);
		assertEquals(Arrays.asList(3, 3), primeFactors);
	}

	@Test
	public void testComputeFactorFor_Given10AsNumber_ShouldReturn2And5() throws Exception {
		List<Integer> primeFactors = PrimeFactor.ComputeFactorFor(10);
		assertEquals(Arrays.asList(2, 5), primeFactors);
	}

}