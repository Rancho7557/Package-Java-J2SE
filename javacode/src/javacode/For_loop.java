package javacode;

import java.util.Scanner;
public class For_loop {

	public static void main(String[] args) {
		 
		int num;
		System.out.println("Enter Any Number: ");
		Scanner tab = new Scanner(System.in);
		num=tab.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}

	}

}
