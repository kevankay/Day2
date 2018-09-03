package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.MultiDimension;

class MultiDimensionTest {

	@Test
	void test() {
		assertEquals("found",MultiDimension.searchElement(new int[][] {{1,2},{3,4}}));
	}

}
