package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Cui;

class CuiTest {

	@Test
	void test() {
		assertEquals(1,Cui.checkid("shiny", "123456", "shiny", "123456"));

	}
}
