package Day17_Read_FromExcelSheet;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCase {

	public WebDriver driver;
	//public ChromeOptions options;
	
	@Test(priority = 1, dataProvider = "TNLogin", dataProviderClass = ExcelCode.class)
	public void loginTNTest(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());	
	}
	@Test(priority = 2, dataProvider = "TNRegister", dataProviderClass = ExcelCode.class)
	public void RegisterTNTest(String firstname,String lastname,String telephone, String email, String passwordR,String confirmpasswordR) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstname);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastname);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(passwordR);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpasswordR);
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']"))
				.isDisplayed());
		driver.quit();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
