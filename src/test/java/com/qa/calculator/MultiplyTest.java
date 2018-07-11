package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		assertEquals(12.0, calc.multiply(6, 2), 0.001);
		assertEquals(4.8, calc.multiply(2.4, 2), 0.001);
		assertEquals(-4.2, calc.multiply(-2, 2.1), 0.001);
	}

}
