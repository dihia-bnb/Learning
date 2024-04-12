package Day16;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Utility {

	public WebDriver driver;
	
	@Test
	public void registerTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Mimiche");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("nait");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("3214569870");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mimiche01");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Mimiche01");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']"))
				.isDisplayed());
		driver.quit();
	}
	
	@Test
	public String emailDateTimeStamp() {
		Date date = new Date();
		System.out.println(date);    // Wed Feb 07 22:21:27 EST 2024                  
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(timeStamp);  //Wed_Feb_07_22_22_51_EST_2024
		return "Mimichenait" + timeStamp + "@gmail.com";	
		
	}
	
}
