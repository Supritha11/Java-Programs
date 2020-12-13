package com.xworkz.accessmodifiers.defaultmodifier;

public class Bike {
	String brand;
	String color;
	double price;
	
	Bike(String inbrand,String incolor,double inprice){
		brand = inbrand;
		color = incolor;
		price = inprice;
	}
	void Riding() {
		System.out.println("Riding");
	}

}
