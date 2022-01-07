package javacode;

public class String_Class {

	public static void main(String[] args) {
		String com = new String("TusDev for web");
		String hanuman = "TusDev for web";
		
		//if(com == hanuman) it is out not equal in java 
		if(com.equals(hanuman))// both are equal in java 
		{
			System.out.println("Both are some key word use in syntax java");
		}
		else
		{
			System.out.println("Not Equal this string because other string veriable define.");
		}
		 
		
		int l = hanuman.length();
		
		System.out.println(l); //it for length
		
		System.out.println(hanuman.toLowerCase()); // it is for Lower String
		System.out.println(hanuman.toUpperCase()); // it is for Upper String

	}

}
