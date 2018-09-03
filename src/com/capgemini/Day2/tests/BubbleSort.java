package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import com.capgemini.Day2.Sorting;

class BubbleSort {

	@Test
	void testsorting() {
		assertArrayEquals(new int[] {1,5,6,7,12,14,19,23,26,35,37,47,52,78,86},Sorting.bubblesort(new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}));
	}

}
