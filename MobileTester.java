package com.xworkz.accessmodifiers.publicmodifier;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile samsung = new Mobile("Samsung", "White", 15000.00);
		System.out.println("Brand : " + samsung.brand);
		System.out.println("Color : " + samsung.color);
		System.out.println("Price : " + samsung.price);
		samsung.chatting();
		samsung.brand ="Oneplus";
		System.out.println("Brand : "+samsung.brand);
		
	}

}
