package com.capgemini.Day2;

public class Discount {
	public static int calcDiscount(int MRP) {
		// TODO Auto-generated method stub
		
		int discount;
		int newitemprice;
		discount = MRP*35/100;
		newitemprice = MRP-discount;
		return newitemprice;
	}
}

