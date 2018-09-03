package com.capgemini.Day2;

public class Result {

	public static String marks(int maths, int physics, int english) {
	if(maths<=100 && physics<=100 && english<=100) {
		if(maths>=60 && physics>=60 && english>=60) {
		return "passed";
		}
		if(maths>=60 && physics>=60 || maths>=60 && english>=60 || physics>=60 && english>=60) {
			return "promoted";
		}
		else {
			return "failed";
		}
	}
		return "Enter correct marks";
	}

}
