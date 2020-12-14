package com.xworkz.accessmodifiers.privatemodifier;

public class Television {
	private String brand;
	private double price;
	private int sizeininches;

	private Television(String inbrand, double inprice, int insizeininches) {
		brand = inbrand;
		price = inprice;
		sizeininches = insizeininches;
	}

	private void watching() {
		System.out.println("Watching");
	}

	public static void main(String args[]) {
		Television tv = new Television("Sony", 30000.00, 50);
		tv.price = 25000.00;
		tv.sizeininches = 40;
		System.out.println("Brand:" + tv.brand);
		System.out.println("Price:" + tv.price);
		System.out.println("Sizeininches:" + tv.sizeininches);
		tv.watching();
	}
}
