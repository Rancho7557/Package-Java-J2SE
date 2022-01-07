package javacode;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		int a, b, c,choice;
		System.out.println("Enter Any Two Numbers:  ");
		Scanner dom = new Scanner(System.in);
		
		a = dom.nextInt();
		b = dom.nextInt();
		System.out.println("Enter Your Choice:  ");
		choice = dom.nextInt(); 
		
		switch(choice)
		{
		case 1: c = a + b;
		System.out.println("Addition "+ c);
		    break;
		
		case 2: c = a - b;
		System.out.println("Substraction "+ c);
		    break;
		
		case 3: c = a * b;
		System.out.println("Multiplication "+ c);
		    break;
		 
		case 4: c = a / b;
		System.out.println("Division "+ c);
		    break;
		
		case 5: c = a % b;
		System.out.println("Reminder Values "+ c);
		    break;
		    
		default: System.out.println("Invalid Choice");
		
	
		}
	}

}
