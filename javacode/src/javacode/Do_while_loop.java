package javacode;
import java.util.Scanner;

public class Do_while_loop {

	public static void main(String[] args) {
		 
		int num;
		System.out.println("Enter Any Number:  ");
		Scanner soham = new Scanner(System.in);
		
		num = soham.nextInt();
		
		do
		{
			System.out.println(num+"  java");
			++num;
		}
		while(num <= 10);
	}

}
