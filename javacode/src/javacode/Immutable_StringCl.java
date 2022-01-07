package javacode;

public class Immutable_StringCl {

	public static void main(String[] args) {
		 
		String bob = "TusharDoM"; //Immutable (can't change)
		
		String bobtwo = bob.concat(" Web");
		System.out.println(bobtwo);
		
		//TusharDoM--------> 10000.1000.10 both in one memory but diffrence string.
		//TusharDoM--------> 10000.1000.10
		//Excution fast work in java

	}

}
