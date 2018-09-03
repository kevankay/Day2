package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.FindElement;

class FindElementTest {

	@Test
	void testsearch() {
		assertEquals("The given element is present.",FindElement.search(12));
		assertEquals("The given element is present.",FindElement.search(37));
		assertEquals("The given element is not present.",FindElement.search(100));
		assertEquals("The given element is not present.",FindElement.search('a'));
		assertEquals("The given element is not present.",FindElement.search(-15));
		assertEquals("The given element is present.",FindElement.search(-23));
		
	}

}
