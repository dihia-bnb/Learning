package Day21;

public class Wrapper {

	// What is wrapper class
	// Types of wrapper class
	// Why we need wrapper class
	// What is boxing, unboxing, autoboxing, autounboxing
	// What is parsing

	public static void main(String[] args) {
		
		//int - Integer
		//long - Long
		//short - Short
		//boolean - Boolean
		//double - Double
		//char - Character
		//float - Float
		//byte - Byte
		
		//Wrapper classes are pre-defined classes which can contain primitive data type.
		//They wrap primitive data type to Wrapper Class Object
		
		int a = 10;
		System.out.println("The  primitive data type value is : " + a);
		
		Integer b = 10;
		System.out.println("The Wrapper class value is : " + b);
		b.intValue();
		
		

	}

}
