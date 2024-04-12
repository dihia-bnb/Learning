package Day18WaitBrowserOpetion;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeOption {

	public WebDriver driver;
	public ChromeOptions options;

	@Test (invocationCount=10) //for run 10 times
	public void tutorialTNLogin() {
		options = new ChromeOptions();
		// options.setPageLoadStrategy(PageLoadStrategy.NORMAL); //6.277 seconds
		// options.setPageLoadStrategy(PageLoadStrategy.NONE);
           
		
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
		//Assert.fail();//for fail the test case
		
	}

}
