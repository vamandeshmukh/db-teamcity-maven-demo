package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	Calc calc = new Calc();

	@Test
	public void testAddNums() {
		assertEquals(15, calc.addNums(5, 10));
	}

}
