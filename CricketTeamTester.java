package com.xworkz.staticmember.fields;

public class CricketTeamTester {

	public static void main(String[] args) {

		CricketTeam player1 = new CricketTeam("Dhoni", 32, 7);
		player1.displaydetails();
		CricketTeam.setteamname("India");
		CricketTeam player2 = new CricketTeam("Virat", 30, 18);
		player2.displaydetails();
		CricketTeam player3 = new CricketTeam("Rahul", 28, 01);
		player3.displaydetails();

	}

}
