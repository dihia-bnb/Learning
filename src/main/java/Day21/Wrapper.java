package Day21;

import java.util.ArrayList;

public class Wrapper {

	// What is wrapper class
	// Types of wrapper class
	// Why we need wrapper class
	// What is boxing, unboxing, autoboxing, autounboxing
	// What is parsing

	public static void main(String[] args) {

		// int - Integer
		// long - Long
		// short - Short
		// boolean - Boolean
		// double - Double
		// char - Character
		// float - Float
		// byte - Byte

		// Wrapper classes are pre-defined classes which can contain primitive data
		// type.
		// They wrap primitive data type to Wrapper Class Object

		int a = 10;
		System.out.println("The  primitive data type value is : " + a);

		Integer b = 10;
		System.out.println("The Wrapper class value is : " + b);
		b.intValue();

		// When we use Collection framework
		// to convert the primitive data types into Objects and vice versa

		ArrayList<Integer> array = new ArrayList<Integer>();
		// ArrayList<int> array = new ArrayList<Integer>(); it not can be possible

		boxingExample();
		autoboxingExample();
		unboxingExample();
		autoUnboxingExample();
	}
	// The parent of the below classes is Number Class
	// Integer
	// Long
	// Short
	// Double
	// Float
	// Byte

	// The parent class of the below mentioned classes is Object Class
	// Boolean
	// Character

	// What is Boxing?
	// Conversion of primitive data type to Wrapper Class Object

	// What is Unboxing?
	// Conversion of Wrapper Class object into primitive data type

	// Homework - try boxing, unboxing, autoboxing and autounboxing for other
	// Wrapper Class Objects and data types

	public static void boxingExample() {
		int a = 100; // a is primitive data type
		Integer b = Integer.valueOf(a); // b is Wrapper class Object
		System.out.println("The wrapper class object is : " + b);
	}

	public static void autoboxingExample() {
		int a = 100;
		Integer b = a;
		System.out.println(b);

	}

	public static void unboxingExample() {
		Integer result = 100;
		int newResult = result.intValue();
		System.out.println("The primitive data type is : " + newResult);
	}

	public static void autoUnboxingExample() {
		Integer result = 100;
		int newResult = result;
		System.out.println("The primitive data type is : " + newResult);

	}
}
