package Day16;

import org.testng.annotations.DataProvider;

public class Data_Provide {

	
	@DataProvider(name="TNLogin")
	public Object[][] getTNLoginData() {
		Object[][] data = { 
				{"Minichenait@gmail.com" , "Mimichenait01"},
				{"Minichenait1@gmail.com" , "Mimichenait01"},
				{"Minichenait2@gmail.com" , "Mimichenait01"},
				{"Minichenait3@gmail.com" , "Mimichenait01"},
				{"Minichenait4@gmail.com" , "Mimichenait01"}}
				            ;
		
		return data;
				            
		}
	
	@DataProvider(name="TNRegister")
	public Object[][] getTNRegisterData(){
		Object[][] data = { {"Krimo", "Nait", "Mimichenait@gmail.com", "123456789", "Mimichenait01", "Mimichenait01"},
	            {"Krimo", "Nait", "Mimichenait@gmail.com", "123456789", "Mimiche123", "Mimiche123"}};
		return data;
		
	}
}
