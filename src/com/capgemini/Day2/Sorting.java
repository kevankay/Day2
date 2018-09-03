package com.capgemini.Day2;

public class Sorting {

	

	public static int[] bubblesort(int array[]) {
		// TODO Auto-generated method stub
		for(int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
