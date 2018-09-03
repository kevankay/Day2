package com.capgemini.Day2;

public class Plaindrome {

	public static Boolean checkpalindrome(int number) {
		int digit;
		int sum=0;
		int originalNumber = number;
		while (number>0) {
			digit = number % 10;
			sum = sum*10 + digit;
			number = number/10;
		}
		if(originalNumber == sum) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
