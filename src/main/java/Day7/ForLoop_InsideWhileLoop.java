package Day7;

public class ForLoop_InsideWhileLoop {

	public static void main(String[] args) {
		int a = 1 ;
		while (a < 10) {
			for (int j=1; j<9; j++) {
				System.out.println(23+37);
				
			}
			System.out.println("This is while loop body");
			break;
			
		}
		System.out.println("the while loop body will not be exxcuted because condition is flase in the while loop iteself");
		

	}

}
