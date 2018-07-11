package com.qa.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Add add = new Add();
		assertEquals(8, add.add(6,2), 0.0001);
		assertEquals(6.2, add.add(4.8, 1.4), 0.0001);
		assertEquals(-35.5, add.add(-50,14.5),0.0001);
	}

}
