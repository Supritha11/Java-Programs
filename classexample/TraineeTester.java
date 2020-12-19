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
//Output
//Id :1 Name: Supritha Emailid :supritha@gmail.com Age :22 Institution :null
//In static method
//Id :2 Name: Amitha Emailid :amitha@gmail.com Age :22 Institution :X-Workz
//Id :2 Name: Megha Emailid :megha@gmail.com Age :21 Institution :X-Workz


