package com.capgemini.Day2;

public class ArmstrongRange {

	public static int[] findAllArmstrongNumbers(int start, int end) {
		int index=0;
		int digit;
		int sum=0;
		int allArmstrongNumber[]=new int[10];
		int number;
		for(int i=start;i<end;i++ ) {
		number=i;
		sum=0;
		while(number!=0) {
	         digit=number%10;
	         sum=sum+digit*digit*digit;
	         number=number/10;
		}
	         if(sum==i) {
	        	 allArmstrongNumber[index++]=i;
	         }
		}
	         return allArmstrongNumber;
	    }
}
