package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//All the warning messages or success messages - try to save it in the form of a String and then validate
public class Assertion {
	// We write Automation Code. We write Test CASES
	// Assertions are validations specific to TestNG - this will help you validate
	// your Test Cases

	// Types of Assertions: -
	// 1. Hard Assert. This is called Assert only but we tend to use the word Hard
	// 2. Soft Assert

	// What is Assert.
	// Assert is a class in TestNG Library

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test(priority = 1)
	public void enterValidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed()); // This is assertion
	}

	@Test(priority = 2)
	public void enterValidEmailInValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("Will the child return ? "
				+ driver.findElement(By.xpath("//i[@class = 'fa fa-exclamation-circle']")).getText());

		WebElement whichHoldsTheWarningMessage = driver
				.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]"));

		// Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,
		// 'alert-dismissible')]")).isDisplayed());

		String actualWarningMessage = whichHoldsTheWarningMessage.getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";

		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		// Assert.assertEquals(actualWarningMessage, expectedWarningMessage);

	}
	
	

}
