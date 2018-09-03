package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Armstrong;

class ArmstrongTest {

	@Test
	void testCheckArmstrong() {
		assertEquals(true, Armstrong.checkarmstrong(153));
		assertEquals(true, Armstrong.checkarmstrong(-153));
		assertEquals(false,Armstrong.checkarmstrong(189));
		assertEquals(false,Armstrong.checkarmstrong(-189));
		assertEquals(false,Armstrong.checkarmstrong('a'));
		assertEquals(false,Armstrong.checkarmstrong(054));
		
	}

}
