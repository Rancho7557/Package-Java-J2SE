package javacode;

public class Class_Object {
	//class is a virtual part iskeliye koi memory create nhi hotta hai java me.
	
	//COMMON PROPERTIES IN JAVA  IT'S CALL VIRTUAL PART OF CLASS
	int age = 21;
	int weight = 51;
	String color = "Light";
	
	//COMMON BEHAVIORS IN JAVA  IT'S CALL VIRTUAL PART OF CLASS
	void eat()
	{
		System.out.println("I'M EATING");
	}
	void sleep()
	{
		System.out.println("I'M SlEEPING");
	}
	
	//HOW CAN WE ACCSES IN REAL PART FROM OBJECT THROUGH IN MAIN FUNCTION DEFINE.
	
	public static void main(String[] args) {
		
		//its called object in java 
		Class_Object TusObj = new Class_Object();
		System.out.println(TusObj.age);
		System.out.println(TusObj.weight);
		System.out.println(TusObj.color);
		
		TusObj.eat(); TusObj.sleep();
		
		
		 
		

	}

}
