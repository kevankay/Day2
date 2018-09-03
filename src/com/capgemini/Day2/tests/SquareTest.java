package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Square;

class SquareTest {

	@Test
	void testCalcualteSquare() {
		assertEquals(25, Square.calculateSquare(5));
		assertEquals(25, Square.calculateSquare(-5));
		assertEquals(0, Square.calculateSquare(0));
		assertEquals(9409, Square.calculateSquare('a'));
		assertEquals(1936, Square.calculateSquare(054));
	}

}
