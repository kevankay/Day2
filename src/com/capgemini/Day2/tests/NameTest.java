package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.Names;

class NameTest {

	@Test
	void test() {
		String s1[] = {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dave"};
		assertEquals(2,Names.findDuplicate(s1,"Sam"));
	}

}
