package Day7;

public class For_Loop {

	public static void main(String[] args) {
		// for(initialization ; condition ; increment/decrement){
		//body   
		  //}
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.print(i);
		}
		System.out.println("*************************************************************************");
		for(int a=10; a>=1;a--) {
			System.out.print(a+" ");
		}
		System.out.println("*************************************************************************");
		for(int b=2; b<=10; b++) {
			System.out.print(2*b+ " ");
		}
		System.out.println("***************************************************************");
		int sum=0;
		for(int c=1; c<=50; c++) {
			System.out.print(c+ " ");
			sum=sum+c;			
		} System.out.println("Sum = "  +sum);
		

	}

}
