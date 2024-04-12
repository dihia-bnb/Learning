package Day9th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_Application_In_Automation {
public WebDriver driver;
	
	
	@BeforeMethod
	public void openWebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test
	public void registerTest() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Dihia");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Bounab");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5123799308");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("a.agree+input+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void closeTheWebsite() {
		driver.close();
	}
}
