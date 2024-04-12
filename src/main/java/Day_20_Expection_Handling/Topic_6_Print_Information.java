package Day_20_Expection_Handling;

public class Topic_6_Print_Information {

	public static void main(String[] args) {
		int a=100, b=0, c;
		//select the code and right click surround with try/catch
			try {
				c = a/b;
				System.out.println(c);
			} catch (Exception e) {
				// e.printStackTrace(); //prints ExceptionName, ExceptionDescription and also stack trace
				//System.out.println(e);  //prints ExceptionName, ExceptionDescription
				//System.out.println(e.toString()); //prints ExceptionName, ExceptionDescription
				System.out.println(e.getMessage()); //prints ExceptionDescription
			}
		
	}
}
