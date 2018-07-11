package com.qa.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		assertEquals(8, calc.add(6,2), 0.0001);
		assertEquals(6.2, calc.add(4.8, 1.4), 0.0001);
		assertEquals(-35.5, calc.add(-50,14.5),0.0001);
	}

}
