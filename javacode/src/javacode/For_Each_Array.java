package javacode;

import java.util.Arrays;
import java.util.Scanner;

// when we need to user information then we will use for _ Each Array.
// it is a 1D Arrays program . 

public class For_Each_Array {

	public static void main(String[] args) {
		 
		//int a[] = {10, 20, 30, 40 ,50}; //a[5]; every data print 
		int a[] = new int[5];
		System.out.println("Visitor please  write your 5 rating for Us!");
		Scanner dhiraj = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			a[i] = dhiraj.nextInt();
		}
		Arrays.sort(a);
		System.out.println(" Sorted Array Elements:  ");
		
		for( int b : a)
		{
			System.out.println(b + "   ");
		}

	}

}
