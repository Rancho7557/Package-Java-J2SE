package javacode;

public class Incre_Decre_op {

	public static void main(String[] args) {
		 
		int a = 10;
		
		//int += 10; mean a = a + 10; = 20
		
		System.out.println(a--);// POST DECREMENT 10------->9
		
		System.out.println(--a);// PRE DECREMENT 8
		
		System.out.println(a++);// POST INCREMENT 8--------->9
		
		System.out.println(++a);// PRE INCREMENT 10

		
		a += 20;
		System.out.println(a);
	}

}
