package com.xworkz.staticmember.fields;

public class TraineeTester {

	public static void main(String[] args) {
		Trainee supritha = new Trainee(1, "Supritha", "supritha@gmail.com", 22);
		supritha.displayDetails();
		Trainee.setinstitution("X-Workz");
		Trainee amitha = new Trainee(2, "Amitha", "amitha@gmail.com", 22);
		amitha.displayDetails();
		Trainee megha = new Trainee(2, "Megha", "megha@gmail.com", 21);
		megha.displayDetails();
		
	}

}
