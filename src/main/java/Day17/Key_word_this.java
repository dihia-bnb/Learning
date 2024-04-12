package Day17;

public class Key_word_this {

	// 1. refer to the current class instance variable
	// 2. can be used to invoke current class method(implicitly)
	// 3. this() can be used to invoke current class constructor
	// 4. can be used to pass an argument in a method call
	// 5. can be used to pass an argument in constructor call
	// 6. can be used to return the current class instance from the method

	// this keyword is a reference variable which refers to the Object

	private int identity; // instance variable. Is instance variable part of the object ??? YES

	void setValues(int identity) {

		this.identity = identity;

		// this keyword refers to the current class instance variable

		// but what if this is alone ???
		// this will refer to the object

	}

	void getShow() {
		System.out.println(identity);
	}
}
