package Day7;

public class While_Loop {

	public static void main(String[] args) {
		// when the knowledge of end point is not clear
		//when something tends to infinty
		//we use while loop
		//cnn.com is a news website 
		//today the total no of links =343
		int i=1;
		while(i<6) {
			System.out.println("Keep printing the value of i ");
			i=i+1;
			
		}
		System.out.println();
		int a=0;
		while(a<100) {
			System.out.print(a +" ");
			a++;
		}
         System.out.println();
		int b=100;
		while(b>=0) {
			System.out.print(b+ " ");
			b--;
		}
		System.out.println();
		int j=1;
		while(j<=20) {
			System.out.print(j*5 + " ");
			j++;
		}
		System.out.println();
		
		int k = 1;
		while(k<1083) {
			System.out.print(k*97 + " ");
			k++;
		}
	}

}
