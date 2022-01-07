package javacode;

public class Private_Constructor {
		
		int a; double b; String c;
		private  Private_Constructor()
		{
	      a = 10; b = 75.57; c = "Tushar Private Constructor";
	      System.out.println(a + " " + b + " " + c);
        }
		
	public static void main(String[] args) {
		 Private_Constructor tus = new  Private_Constructor();
	}
	
}
