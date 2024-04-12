package Day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register {
	public WebDriver driver;

	@Test(dataProvider = "getTNLoginData", retryAnalyzer= MyRetry.class)
	public void loginTest(String firstName,String lastName ,String email,String telephone, String password, String confirmPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']"))
				.isDisplayed());
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getTNRegisterData(){
		Object[][] data = { {"Krimo", "Nait", "Mimichenait@gmail.com", "123456789", "Mimichenait01", "Mimichenait01"},
	            {"Krimo", "Nait", "Mimichenait@gmail.com", "123456789", "Mimiche123", "Mimiche123"}};
		return data;
		
	}
	
}
