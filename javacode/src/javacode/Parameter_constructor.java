package javacode;

public class Parameter_constructor {
	
		int x, y;
		Parameter_constructor  (int a, int b) // Parameterized Constructor;
	    {
		 x = a; y = b;
	    }
		
		Parameter_constructor  (int a, String b) // Parameterized Constructor;
	    {
			System.out.println(a +" "+ b);
	    }
		
	    void Screen()
	    {
		  System.out.println(x +" "+ y);
	    }
	
	class vittle
	{
		
	}
	
	public static void main(String[] args) {
		 
		Parameter_constructor r = new  Parameter_constructor(100, 1000);
		r.Screen();
		Parameter_constructor ref = new  Parameter_constructor(990, "TUSooPS");
		 
	}

}
