package javacode;
import java.util.Scanner;

public class condition_ifelse {

	public static void main(String[] args) {
		
		int pwd;
		System.out.println("Enter Password:= "); 
		Scanner obj = new Scanner(System.in);
		pwd=obj.nextInt();
		if(pwd==7557)
		{
			System.out.println("My Name:= Mr.Tushar Ashokrao Dhanurkar");
			System.out.println("My Age:= 25");
			System.out.println("My Contact:= 8888598048");
			System.out.println("My Address:= 2D14 Shidharth Nager old Village Aundh Pune");
		}
		else
		{
			System.out.println("Sorry You are Enter Wrong Password!");
		}

	}

}
