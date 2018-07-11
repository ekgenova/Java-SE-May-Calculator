package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		assertEquals(4.5, calc.divide(9,2), 0.0001);
		assertEquals(2, calc.divide(4,2), 0.0001);
		assertEquals(-6.2, calc.divide(24.8, -4), 0.0001);
	}

}
