package Batch_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cnn {
	public WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cnn.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		String expectedTitle = "Breaking News, Latest News and Videos | CNN";
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl = "https://www.cnn.com/";

		if (expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.partialLinkText("Opinion")).click();

		} else {
			System.out.println("The title is incorrect  ");
		}
	}

	@Test  (priority = 2)
	public void login() throws InterruptedException {
		driver.findElement(By.partialLinkText("Opinion")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//button[@aria-label='User Account Log In Button'])[2]")).click();
		driver.get("https://www.cnn.com/account/log-in");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Log in to your CNN account | CNN";
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl = "https://www.cnn.com/account/log-in";
		if (expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			// driver.findElement(By.id("login-email-input")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='loginEmail']")).sendKeys("Mimichenait@gmail.com");
			// driver.findElement(By.id("login-password-input")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='loginPassword']")).sendKeys("Mimichenait01");
			driver.findElement(By.id("user-account-login-form__button")).click();

		} else {
			System.out.println("The title is incorrect  ");
		}

	}

	@Test (priority = 1)

	public void loginWithOutCredantls() throws InterruptedException{
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//button[@aria-label='User Account Log In Button'])[2]")).click();
		// scc = div#login-email-error-text
		// xpath = //div[contains(@id,'login-email-error-text')]
		String acctualEmailWarringMassage = driver
				.findElement(By.cssSelector("div#login-email-error-text")).getText();
		String expectedEmailWarringMassage = "Email address is required";
		Thread.sleep(4000);
		Assert.assertEquals(acctualEmailWarringMassage, expectedEmailWarringMassage);
		//Assert.assertTrue(acctualEmailWarringMassage.contains(expectedEmailWarringMassage));

		// scc= div#login-email-error-text
		/*
		String acctualPasswordWarringMassage = driver
				.findElement(By.xpath("//div[contains(@id,'login-email-error-text')]")).getText();
		String expectedPasswordWarringMassage = "Email address is required";
		Assert.assertEquals(acctualPasswordWarringMassage, expectedPasswordWarringMassage);
*/
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
