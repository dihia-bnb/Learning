package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Failures {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("login")).click();
	}

	@Test(priority=1)
	public void loginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@Test(priority=2)
	public void loginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait0123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
	}
	
	@Test(priority=3)
	public void loginWithInvalidEmailValidPassword() {
		//We have decided to fail Test Case no 3 with Assert
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait2548@gmail.comm");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait0123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		//Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		Assert.fail("Deliberate Failure");
		//is not excuted because is false the code stop it here
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	
	@Test(priority=4, enabled=false, alwaysRun = true, dependsOnMethods = {"loginWithValidCredentials", "loginWithValidEmailInvalidPassword", "loginWithInvalidEmailValidPassword"})
	public void loginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait21456@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait0123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	@Test(priority=5)
	public void loginWithNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
