package Day_20_Expection_Handling;

public class Topic_8_Thow_Keyword {

	public static void main(String[] args) { //main method is acting as the caller method
		divideByZero();
		
	}
	
	
	
	public static void divideByZero() {     //is the origin of the Exception
		int a=100, b=0 , c;
		c = a/b;
		System.out.println(c);
		//last statement to be write 
		throw new ArithmeticException("I am trying to handle this exception by self");
       //no more code here
	}
}
