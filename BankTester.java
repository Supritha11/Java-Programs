package com.xworkz.encapsulation;

public class BankTester {

	public static void main(String[] args) {

		Bank kotak = new Bank(123456789, "Supritha", "RR Nagar");
		System.out.println("Name:" + kotak.name);
		System.out.println("AccountNumber:" + kotak.acctnum);
		System.out.println("Branch:" + kotak.branch);
		kotak.withdraw(5000.00);// balance-=amount ->balance = 10000 - 5000.00 = 5000.00
		kotak.deposit(10000.00);// balance +=amount -> balance = 5000.00+10000.00 = 15000.00
		System.out.println("Mini Statement : ");
		kotak.ministatement();

	}

}
//Output:
//Name:Supritha
//AccountNumber:123456789
//Branch:RR Nagar
//Mini Statement:
//For AccountNum : 123456789 Balance Is : 15000.0