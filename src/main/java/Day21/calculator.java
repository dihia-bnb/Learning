package Day21;

import java.util.Scanner;

public class calculator {
	//Addition, Subtraction, Multiplication, Division
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1= scan.nextInt();
		
		System.out.println("Enter second number");
		int number2= scan.nextInt();
		
		System.out.println("choose the mathematical operation (+,-,*,/)");
		String mathOperator = scan.next();
		int result;
		switch(mathOperator) {
		
		case"+" : result = number1+number2;
		System.out.println("The sum of two number is " + result);
		break;
		
		case"-" : result = number1+number2;
		System.out.println("The diffrente of two number is " + result);
		break;
		
		case"*" : result = number1+number2;
		System.out.println("The multiplication of two number is " + result);
		break;
		
		case"/" : result = number1+number2;
		System.out.println("The division of two number is " + result);
		break;
		
		default: System.out.println("invalid mathOperator");
		break;
		
		}
		
	}

}
