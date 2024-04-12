package Day17;

public class Child  extends Parent{

	// 1. super keyword is used to refer immediate immediate parent class instance
	// variable
	// 2. can be used to invoke immediate parent class method
	// 3. super() can be used to invoke immediate parent class constructor

	public static void main(String[] args) {
		Child child = new Child();
		child.show(50);

	}

	int i = 20;

	void show(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.a);
		super.takeAway();
	}

	public Child() {
		super();
	}
}
