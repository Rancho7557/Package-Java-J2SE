package javacode;
import java.util.Arrays;
import java.util.Scanner;

//2d arrays .

public class Arrays_TwoD {

	public static void main(String[] args) {
		 
		int a [][]= new int [2][2];
		System.out.println("Enter Array Elements: ");
		Scanner Jobtus = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				a[i][j] = Jobtus.nextInt();
			}
		}
		
	    System.out.print("\nMatrix Element: \n");
	    for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				 System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}   
	    
	}

}
