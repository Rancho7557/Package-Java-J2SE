package javacode;

import java.util.Scanner;

public class add_two_numbers {

	public static void main(String[] args) {
		 int a,b,c;
		 System.out.println("Enter Any Two Numbers: ");
		 Scanner tus=new Scanner(System.in);

		 a=tus.nextInt();
		 b=tus.nextInt();
		 
		 c=a+b;
		 System.out.println("Sum of two Numbers is: "+c);
	}

}
