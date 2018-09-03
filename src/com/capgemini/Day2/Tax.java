package com.capgemini.Day2;

public class Tax {

	public static double calculateIncomeTax(double income) {
		
		if(income>=181001 && income<=300000) {
		     return (10*income)/100;
			}
		else if(income>=300001 && income<=500000) {
		     return (20*income)/100;
			}
		else if(income>=500001 && income<=1000000) {
		     return (30*income)/100;
			}
		return (Double) null;
		
	}
	public static String calculateIncome(int income) {
		if(income>0 && income<180000) {
		     return "nill";
			}
		else {
			return "Enter valid income";
		}
	}
}
