package Day7;

public class Do_While_Loop {

	public static void main(String[] args) {
		
		
		/*
		do {
		//body of the do block
			//first the body will be executed.
			//the it will check for the condition.
			//if the while condition is true then again the do will execute 
			//if the while condition is false then the do will not execute 
		}while( true != false);
		*/

		int i=0; 
		do { i++;
			System.out.println(i);
			
		}while(i<5);
		
		int a =1;
		do {
			
			System.out.println(" Hello Wold");
			a++;
		}while(a<=1000);
		
		int b=0;
		while(b<=1000) {
			System.out.println(b+" Hello Wold");
			b++;
		}
	}

}
