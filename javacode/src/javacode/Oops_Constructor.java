package javacode;

public class Oops_Constructor {
	
	int a; String name;
	
	//if we not use this code oops_constructor then also excute by defualt in java.
	/*Oops_Constructor()  //it is self created constructor in java.
	   {
		a = 0; name = null;
	   }*/
		void show()
		{
			System.out.println(a + "    " + name);
		}
		public class B 
		{
			
		}

	public static void main(String[] args) {
		 //self created constructor in java.
		
		Oops_Constructor ref = new Oops_Constructor();
		ref.show();

	}

}
