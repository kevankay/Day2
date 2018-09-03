package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Tax;

class incomeTaxTest {

	@Test
	void testcalculateIncomeTax() {
		assertEquals("nill",Tax.calculateIncome(29000));
		assertEquals(70110,Tax.calculateIncomeTax(350550));
		assertEquals("Enter valid income",Tax.calculateIncome(1500000));
		assertEquals("Enter valid income",Tax.calculateIncome(-1000));
		
	}

}
