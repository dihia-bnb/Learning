package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssgnimentAssert {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@Test
	public void RegisterWithNoIput() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualPrivacyPolicyWarningMessage = driver
				.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(actualPrivacyPolicyWarningMessage, expectedPrivacyPolicyWarningMessage);

		String actualFirstNameWarningMessage = driver.findElement(By.cssSelector("input#input-firstname+div"))
				.getText();
		String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";
		Assert.assertTrue(actualFirstNameWarningMessage.contains(expectedFirstNameWarningMessage));

		String actualLastNameWarningMessage = driver.findElement(By.cssSelector("input#input-lastname+div")).getText();
		String expectedLastNameWarningMessage = "Last Name must be between 1 and 32 characters!";
		Assert.assertTrue(actualLastNameWarningMessage.contains(expectedLastNameWarningMessage));

		String actualEmailWarningMessage = driver.findElement(By.cssSelector("input#input-email+div")).getText();
		String expectedEmailWarningMessage = "E-Mail Address does not appear to be valid!";
		Assert.assertTrue(actualEmailWarningMessage.contains(expectedEmailWarningMessage));

		String actualTelephoneWarningMessage = driver.findElement(By.cssSelector("input#input-telephone+div"))
				.getText();
		String expectedTelephoneWarningMessage = "Telephone must be between 3 and 32 characters!";
		Assert.assertTrue(actualTelephoneWarningMessage.contains(expectedTelephoneWarningMessage));

		String actualPasswordWarningMessage = driver.findElement(By.cssSelector("input#input-password+div")).getText();
		String expectedPasswordWarningMessage = "Password must be between 4 and 20 characters!";
		Assert.assertTrue(actualPasswordWarningMessage.contains(expectedPasswordWarningMessage));
	}

	public void registerWithMandatorDtails() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("dihia");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("bounab");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("987456321");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#content>p:nth-child(2)")).isDisplayed());
		
	}
	
	@Test(priority=3)
	public void registerWithAllDetails() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("dihia");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("bounab");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Mimichenaitmn@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("987456321");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#content>p:nth-child(2)")).isDisplayed());
		
		
	}
	@Test(priority=4)
	public void registerWithExistingEmail() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("dihia");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("bounab");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("987456321");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Mimichenait01365");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualExistingWarnigMassage=driver.findElement(By.xpath("//div[contains(@class,' alert-dismissible')]")).getText();
	    String expectedExistingEmailWarningMessage="Warning: E-Mail Address is already registered!";
	    Assert.assertTrue(actualExistingWarnigMassage.contains(expectedExistingEmailWarningMessage));
		
	
	}
	
	@Test(priority=5)
	public void registerWithWrongConfirmPassword() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("dihia");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("bounab");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Mimichenaitgmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("987456321");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
