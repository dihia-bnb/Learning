package Day4;

public class Inc_Dec_Operators_2 {

	public static void main(String[] args) {
		int i = 1 ;
		int j =i++;
		int k= ++i + j++;
		int l= ++i + ++j + k++ + i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
	}

}
