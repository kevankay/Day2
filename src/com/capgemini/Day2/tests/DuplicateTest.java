package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Duplicate;

class DuplicateTest {

	@Test
	void test() {
		assertEquals("ab",Duplicate.RemoveDuplicate("abb"));
	}
	}


