package Day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
public WebDriver driver;
	
	@Test(dataProvider = "getTNLoginData")
	public void loginTest(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
	@DataProvider
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

}
