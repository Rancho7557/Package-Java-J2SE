package javacode;

import java.util.Scanner;

public class Encapsulation_oops {
	private double bal = 5000;
	private int pwd;
	
	
	public void Deposite(double money) 
	{
		System.out.println("Enter  Password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if(pwd == 7557)
		{
			bal = bal + money;
			System.out.println("Deposited Money: " + money);
			System.out.println("Total Balance: " + bal);
		}
		else
		{
			System.out.println("Incorrect Password...");
		}
		
	}
	
	public void Withdraw(double money)
	{
		System.out.println("Enter  Password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if(pwd == 7557)
		{
			bal = bal + money;
			System.out.println("Withdraw Money: " + money);
			System.out.println("Total Balance: " + bal);
		}
		else
		{
			System.out.println("Incorrect Password...");
		}
		
	}
	
	public void checkBal()
	{
		System.out.println("Enter  Password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if(pwd == 7557)
		{
			System.out.println("Total Balance: " + bal);
		}
		
	}
}
class Customer {
	
	public static void main(String[] args) {
		 
		Encapsulation_oops b = new Encapsulation_oops();
		
		int ch;
		System.out.println("1. Deposite: ");
		System.out.println("2. Withdraw : ");
		System.out.println("3. checkBalance: ");
		
		System.out.println("\nEnter Your Choice:");
		Scanner s2 = new Scanner(System.in);
		ch=s2.nextInt();
		
		switch(ch)
		{
		
		case 1: b.Deposite(1000);
		break;
		
		case 2: b.Withdraw(2000);
		break;
		
		case 3: b.checkBal();
		break;
		
		default: System.out.println("Invalid Choice: ");
		}
		
	}

}
