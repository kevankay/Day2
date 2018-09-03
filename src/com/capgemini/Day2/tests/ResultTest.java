package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Result;

class ResultTest {

	@Test
	void testFindResult() {
		assertEquals("passed",Result.marks(90,100,70));
		assertEquals("promoted",Result.marks(90,80,30));
		assertEquals("failed",Result.marks(30,20,40));
		assertEquals("failed",Result.marks(0,0,0));
		assertEquals("passed",Result.marks('a','a','a'));
		assertEquals("failed",Result.marks(-90,-100,-70));
		assertEquals("Enter correct marks",Result.marks(900,1000,170));
	}

}
