package com.capgemini.Day2;

public class Armstrong {

	public static boolean checkarmstrong(int originalnumber) {
		int number;
		int digit;
		int sum=0;
		number = originalnumber;
		while(number!=0) {
		digit = number%10;
		sum=sum+digit*digit*digit;
		number=number/10;
		}
		if(sum==originalnumber) {
		return true;
		}
		else {
			return false;
		}
	}
}
