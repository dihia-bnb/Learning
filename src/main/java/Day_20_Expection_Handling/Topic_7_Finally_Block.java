package Day_20_Expection_Handling;

public class Topic_7_Finally_Block {

	public static void main(String[] args) {
		
		int a=100, b=0, c;
		try {
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("I will be printed no matter what");
		}
	}

}
