package Day7;

public class Nest_For_Loop {

	public static void main(String[] args) {
		for( int i=1; i<=5;i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("This value of inner loop is : "+j);
			}
			System.out.println("outer for loop is : "+i);
		}

	}

}
