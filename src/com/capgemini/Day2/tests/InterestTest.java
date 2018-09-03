package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Interest;

class InterestTest {

	@Test
	void testCalculateInterest() {
		assertEquals(10.0,Interest.calculatesimpleinterest(100.02,2,5), 0.02);
		assertEquals(-10.0,Interest.calculatesimpleinterest(-100,2,5));
		assertEquals(0.0,Interest.calculatesimpleinterest(0,0,0));
		assertEquals(200.0,Interest.calculatesimpleinterest(100,2,100));
		assertEquals(9.7,Interest.calculatesimpleinterest('a',2,5));
		assertEquals(10.25,Interest.calculatecompoundinterest(100,2,5));
		assertEquals(-10.25,Interest.calculatecompoundinterest(-100,2,5));
		assertEquals(0.0,Interest.calculatecompoundinterest(0,0,0));
		assertEquals(300.0,Interest.calculatecompoundinterest(100,2,100));
		assertEquals(9.9425,Interest.calculatecompoundinterest('a',2,5),0.02);
		}
}
