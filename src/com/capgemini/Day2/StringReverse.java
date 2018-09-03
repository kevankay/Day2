package com.capgemini.Day2;

public class StringReverse {

	public static String printReverse(String string) {
		String original = "hello world", reverse=" ";
		int length = original.length();
		for(int i=length-1; i>=0; i--)
			 reverse = reverse + original.charAt(i);
		return reverse;
	}

}
