package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubtractTest {


	@Test
	public void test() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.subtract(10.0,5.0), 0.001);
		assertEquals(2, calc.subtract(8.0,6.0), 0.001);
		assertEquals(-5, calc.subtract(0,5.0), 0.001);
		assertEquals(-24, calc.subtract(-18.0,6.0), 0.001);
		assertEquals(4.8, calc.subtract(6.2, 1.4),0.001);
	}

}
