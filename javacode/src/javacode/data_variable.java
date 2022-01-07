package javacode;

public class data_variable {
	
	int a = 7557; //instance variable
	static double b = 67.25; //static variable

	public static void main(String[] argu) {
		boolean c = false; //local variable
		
		data_variable d = new data_variable();
		System.out.println(d.a+" " +b+" "+c);
		System.out.println(b);
		System.out.println(c);
		

	}

}
