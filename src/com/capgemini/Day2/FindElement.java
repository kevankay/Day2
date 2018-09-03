package com.capgemini.Day2;
public class FindElement {
     public static String search(int number) {
		int n=15, i=0 ,flag=0;
		int a[] = {5,12,14,6,78,19,1,-23,26,35,37,7,52,86,47};
		
       for(i=0;i<n;i++) {
      	 if(a[i]==number) {
    		flag = 1;
    		break;
    	   }
      	 else {
      		 flag = 0;
      	 }
       }
      	 if(flag == 1) {
      		return "The given element is present.";
         }
      	 else {
      		return "The given element is not present.";
      }
		
	}
}
