package Day4;

public class Inc_Dec_Operators_3 {

	public static void main(String[] args) {
		int i = 10 ;
		int j =i-- - i++ + ++i;
		int k= --i + --j - j-- + i++ + i--;
		int l= i++ + j++ + ++k - --k + k--;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
