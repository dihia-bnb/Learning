package Day7;

public class Pattern5 {

	public static void main(String[] args) {
		 //4= 2+3 just change j to 4
		for(int i=1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print( "* ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j = 4; j>=i; j--) {
				System.out.print( "* ");	
			}
			System.out.println();
		}

	}

}
