package Day5;

import test_package.Program1;

public class Access_Modifiers {

	public static void main(String[] args) {
		// public - the code accessible for all the classes
		//protected - this code is accessible in the same package and subclass
		//private - the code is accessible only within the same class
		//default - code is accessible only within the same package
    
		AccessModifier_Public_Validation.test1();
	    Program1.test2();
	    Program2.test3();
	    secretCode();
	}
	private static void secretCode() {
		System.out.println("Secret Code");
	}
	
	static void hello() {
		//this is default method
	}

}
