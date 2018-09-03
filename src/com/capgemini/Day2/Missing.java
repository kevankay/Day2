package com.capgemini.Day2;

public class Missing {
	public static Object calculate(int[] is) {
		// TODO Auto-generated method stub
		for(int i=0;i<is.length;i++)
		{
		//	System.out.println("Enter the array elements:");
			for(int j=i+1;j<is.length;j++)
			{
				if(is[i]>is[j])
				{
					int temp=is[i];
					is[i]=is[j];
					is[j]=temp;
				}
			}
		}
		for(int i=0;i<is.length;i++)
		{
			if(is[i]!=i)
			{
				return i;	
			}
		}
		return null;
	}

}


