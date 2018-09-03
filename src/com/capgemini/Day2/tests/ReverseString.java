package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.StringReverse;

class ReverseString {

	@Test
	void test() {
		assertEquals(" dlrow olleh",StringReverse.printReverse("hello world"));
	}

}
