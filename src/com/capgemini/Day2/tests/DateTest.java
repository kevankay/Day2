package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Date;

class DateTest {

	@Test
	void test() {
		assertEquals("15/May/1995",Date.checkDate(15,05,1995));
		assertEquals("16/May/1995",Date.checkDate(16,05,1995));
	}

}
