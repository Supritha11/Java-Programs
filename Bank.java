package com.xworkz.encapsulation;

public class Bank {
	public int acctnum;
	private double balance;
	public String name;
	public String branch;

	public Bank(int inacctnum, String inname, String inbranch) {
		acctnum = inacctnum;
		name = inname;
		branch = inbranch;
		balance = 10000;

	}

	public void withdraw(double amount) {
		if (amount > 0 && balance > amount)
			balance -=amount;
		else
			System.out.println("Enter amount above 0");

	}

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
	}

	public void ministatement() {
		System.out.println("For AccountNum : " + acctnum  +  " Balance Is : " + balance);
	}
}
