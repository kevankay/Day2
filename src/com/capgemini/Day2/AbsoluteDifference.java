package com.capgemini.Day2;

public class AbsoluteDifference {

	public static Object findAbsollteDifference(int size, int[] array, int k) {
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(Math.abs(i-j) <= k) {
					if(array[i]==array[j]) {
						return 1;
					}
				}
			}
		}
		return 0;
	}

}
