package javacode;

public class Copy_Constructor {
	
	int a; String b;
	Copy_Constructor()
	{
		a = 27; b = "Tushar DOB NAGPUR";
		System.out.println(a +" "+b);
	}
	Copy_Constructor(Copy_Constructor ref)
	{
		a = ref.a;
		b = ref.b;
		System.out.println(a +" "+b);
	}
	
	class game 
	{
		
	}

	public static void main(String[] args) {
		 
		Copy_Constructor copy = new Copy_Constructor();
		Copy_Constructor copy2 = new Copy_Constructor(copy);

	}

}
