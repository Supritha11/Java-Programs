package com.xworkz.staticmember.fields;

public class CricketTeam {

	String name;
	static String teamname;
	int jerseynum;
	int age;

	CricketTeam() {

		System.out.println("No arg conts");

	}

	CricketTeam(String inname, int inage, int injerseynum) {

		name = inname;
		age = inage;
		jerseynum = injerseynum;

	}

	static void setteamname(String newteamname) {
		System.out.println("In Static method");
		teamname = "India";
	}

	void displaydetails() {
		System.out.println("Name : " + name + " Teamname : " + teamname + " Jerseynum :" + jerseynum + " Age : " + age);

	}

}
