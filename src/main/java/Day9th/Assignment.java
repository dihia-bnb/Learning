package Day9th;

public class Assignment {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		double b[]= {1.1, 2.1,3.1,4.1,5.1,6.1,7.1,8.1,9.1,10.2};
		String s[]= {"Kim","Loula","Rose","Mimiche","Youlace","Hanif"};
		 for(int i = 0; i <=a.length - 1; i++) {
			 System.out.print(a[i]+ " ");
		 }
		 
		 System.out.println();
		 for(int i = 0; i <=b.length - 1; i++) {
			 System.out.print(b[i]+ " ");
		 }
		 
		 System.out.println();
		 for(int i = 0; i <=s.length - 1; i++) {
			 System.out.print(s[i]+ " ");
		 }
		 System.out.println();
		 System.out.println(a[19]);
		 try {
				System.out.println("The 11th element of second array is : " + b[10]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		 System.out.println(s[0]);
		 

	}

}
