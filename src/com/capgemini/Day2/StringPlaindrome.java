package com.capgemini.Day2;
public class StringPlaindrome {

	public static Object checkPalindrome(String dad, String pen, String doubt, String cooc) {
		int k=0,count=0;
		String b=" ";
		String temp ="";
		String words[] = {"dad","pen","doubt","cooc"};
		String palindrome[]= new String[5];
		for(int i=0;i<5;i++) {
			int n = words[i].length();
	        for(int j=n-1;j>=0;j--) {
				b=b+words[i].charAt(j);
			}
			if(words[i].equals(b)) {
				count++;
				palindrome[k]=palindrome[i];
				k++;
			}
			b="";
		}
		for(int j=0;j<count-1;j++) {
			for(int i=0; i<count-j-1;i++) {
				int n = palindrome[i].length();
				int m = palindrome[i+1].length();
				if(n>m) {
					temp=palindrome[i+1];
					palindrome[i+1]=palindrome[i];
					palindrome[i]=temp;
				}
			}
		}
		for(int i=0;i<count;i++) {
			int n=palindrome[i].length();
			return palindrome[i];
		}
		return null;
	}
}
