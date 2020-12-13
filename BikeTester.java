package com.xworkz.accessmodifiers.defaultmodifier;

public class BikeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike royalenfield = new Bike("RoyalEnfield","Black",150000.00);
		System.out.println("Brand: " +royalenfield.brand);
		System.out.println("Color: "+royalenfield.color);
		System.out.println("Price :"+royalenfield.price);
		royalenfield.Riding();
		royalenfield.brand = "KTM";
		System.out.println("Brand :"+royalenfield.brand);

	}

}
