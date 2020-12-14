package com.xworkz.memorymanagement;

public class ToFindVolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//volume = 4/3*pi*r^3;
		System.out.println("Program to find volume of sphere");
		ToFindVolumeOfSphere findvol = new ToFindVolumeOfSphere();
		double result = findvol.findvolumeofsphere(1);
		System.out.println("Volume :"+result);
		System.out.println("ENd of program");

	}
	double findvolumeofsphere(int radius) {
		double volume;
		double pi =findpi();
		volume = (4.00/3.00) * pi * radius*radius*radius;
		return volume;

	}

	double findpi() {
		double pi = (22.00 / 7.00);
 		return pi;
	}

	
}
