package com.capgemini.Day2;

public class Interest {

	public static double calculatesimpleinterest(double principle, double time, double rate) {
		double simpleinterest=principle*time*rate/100;
		return simpleinterest;
	}

	public static double calculatecompoundinterest(double principle, double time, double rate) {
		double compoundinterest=principle*Math.pow(1.00+rate/100,time)-principle;
		return compoundinterest;
	}

}
