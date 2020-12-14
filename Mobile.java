package com.xworkz.accessmodifiers.publicmodifier;

public class Mobile {
	public String brand;
	public String color;
	public double price;

	public Mobile(String inbrand, String incolor, double inprice) {
		brand = inbrand;
		color = incolor;
		price = inprice;
	}

	public void chatting() {
		System.out.println("chatting");
	}

}
