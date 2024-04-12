package Day5;

public class Control_Statements {
	
	// Ther are 3 type of contral statements in java
	//1. Selection or Conditional Statement
	//Example - if, if else , if else if , swith
	//2. Iteration or looping Statement
	//Example - while , for , for each (advanced for loop), do while
	//3.Jump break , continue , return

	public static void main(String[] args) {
		//learningifstatement();
		//greatesOf4Number();
		//determinelLeapYear();
		checkingWithString();

	}
	public static void learningifstatement() {
		//syntax
		//application of the syntax
		//sense of the logic
		if(2==3) {
			System.out.println("The if condition is true");
		}else{
			System.out.println("The if condition was stupid");
		}
	}
	
	public static void greatesOf4Number() {
		int a= 21;
		int b= 31;
		int c= 41;
		int d= 51;
		if(a>b && a>b && a>d) {
			System.out.println("a is the greatest : " +a);
		}else if(b>a && b>c && b>d) {
			System.out.println("b is the greatest : " +b);
		}else if(c>a && c>b && c>d) {
			System.out.println("c is the greatest : " +c);
		}else {
			System.out.println("d is the greatest : " +d);
		}
	}
	public static void determinelLeapYear() {
		int year1 = 1996;
		int year2 = 2002;
		int year3 = 2004;
		
		if (year1 % 4 == 0) {
			System.out.println("year1 is  leap year");
		}else {
			System.out.println("year1 is not leap year");
		}
	
	}
	public static void checkingWithString() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = "Hello";
		String S4 = "Java";
		
		if (S1 != S2) {
			System.out.println("both string are equal");
		}else {
			System.out.println("string are not equal");
		}
		
	}
	

}
