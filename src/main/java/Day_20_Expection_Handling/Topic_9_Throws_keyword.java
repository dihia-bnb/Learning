package Day_20_Expection_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic_9_Throws_keyword {

	
	public static void main(String[] args) throws FileNotFoundException {
		filePresentOrNot();
	}
	
	public static void filePresentOrNot() throws FileNotFoundException {
		// throws used beside the method
		//try/catch it used inside the method
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\Login.txt");
	}

}
