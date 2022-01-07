package javacode;

public class Defualt_Constructor {
	
	int a; String b; boolean c;
		
	Defualt_Constructor() //default constructor
		{
			a = 1080; b ="TusDev oPPS JAVA "; c = true;
			//  0          null                   false by default constructor;
		}
	void Display()
	{
		System.out.println(a + "  "+ b +" "+ c);
	}
	
	public class dnmobj 
	{
		
    }
	 
	public static void main(String[] args) {
		 
		Defualt_Constructor rom = new Defualt_Constructor();
		
		rom.Display();
			
	}

}
