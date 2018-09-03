package com.capgemini.Day2;

public class Cui {

	public static int checkid(String userid, String password, String id, String pass) {
		if(userid.equals(id)&&password.equals(pass)) {
		return 1;
	}
		else {
			return 0;
		}
	}
}
