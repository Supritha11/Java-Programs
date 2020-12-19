package com.xworkz.staticmember.fields;

public class Trainee {

	int id;
	String name;
	String emailid;
	static String institution;
	int age;

	Trainee() {
		System.out.println("No arg constructors");
	}

	Trainee(int inid, String inname, String inemailid, int inage) {
		id = inid;
		name = inname;
		emailid = inemailid;
		age = inage;
	}

	static void setinstitution(String institutionName) {
		System.out.println("In static method");
		institution = "X-Workz";

	}

	void displayDetails() {
		
		System.out.println("Id :" + id + " Name: " + name + " Emailid :" + emailid + " Age :" + age + " Institution :"
				+ institution);
	}
}