package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.StringPlaindrome;

class StringPalindrome {

	@Test
	void test() {
		assertEquals("dad",StringPlaindrome.checkPalindrome("dad","pen","doubt","cooc"));
	}

}
