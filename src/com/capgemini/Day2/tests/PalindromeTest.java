package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Plaindrome;

class PalindromeTest {

	@Test
	void test() {
		assertEquals(true,Plaindrome.checkpalindrome(151));
		assertEquals(false,Plaindrome.checkpalindrome(-235));
		assertEquals(false,Plaindrome.checkpalindrome('a'));
		assertEquals(false,Plaindrome.checkpalindrome(0x452));
		assertEquals(false,Plaindrome.checkpalindrome(0213));
	}

}
