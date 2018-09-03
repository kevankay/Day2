package com.capgemini.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day2.studentMarks;

class Averagemarks {

	@Test
	void studentMarkTest() {
		assertEquals(100, studentMarks.calStudentSum(20,50,30),0.02);
		assertEquals(120.752, studentMarks.calStudentSum(20.2,80.4,20.152),0.02);
		assertEquals(33, studentMarks.calStudentAverage(20,50,30),0.02);
		assertEquals(90, studentMarks.calStudentAverage(10,50,30),0.02);
		assertEquals(294, studentMarks.calSubjectSum('a','b','c'),0.02);
		assertEquals(30, studentMarks.calSubjectAverage(10,50,30),0.02);
	}

}
