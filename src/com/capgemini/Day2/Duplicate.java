package com.capgemini.Day2;

public class Duplicate {

	public static String RemoveDuplicate(String input) {
		// TODO Auto-generated method stub
		char ch;
	String output="" ;
		for(int i=0; i<input.length(); i++)
		{
			ch = input.charAt(i);
			
			if(ch!=' ')
			{
				
				output = output + ch;
				input=input.replace(ch, ' ');
				
			}
			
		}
		return output;
	}
	

}

