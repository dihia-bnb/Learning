package TestNGDay10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignmentTest {
	
	public  WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Your Store";
		
		String actualCurrentUrl =driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl="https://tutorialsninja.com/demo/";
		
		if (expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			
		}else {
			System.out.println("The title is incorrect  " );
		}
	}

	@Test 
	public void testCase1() {
		String actualLoginPageTitle =driver.getTitle();
		System.out.println(actualLoginPageTitle);
		String expectedLoginPageTitle="Account Login";
		
		String actualLoginPageCurrentUrl =driver.getCurrentUrl();
		System.out.println(actualLoginPageCurrentUrl);
		String expectedLoginPageCurrentUrl="https://tutorialsninja.com/demo/index.php?route=account/login";
		
		if (actualLoginPageTitle.equals(expectedLoginPageTitle) && actualLoginPageCurrentUrl.equals(expectedLoginPageCurrentUrl)) {
			driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

			
		}else {
			System.out.println("The title and current url of login are incorrect  " );
		}
		
		
	}
 
	@Test
	public void testCase2() {
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
	
	@Test
	public void testCase3() {
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualLoginPageTitle =driver.getTitle();
		System.out.println(actualLoginPageTitle);
		String expectedLoginPageTitle="Account Login";
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
