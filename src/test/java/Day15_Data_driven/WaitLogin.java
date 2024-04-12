package Day15_Data_driven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitLogin {
	public WebDriver driver;
	public WebDriverWait wait;
	@Test
	public void ValidCredentails() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account"))); // clicking on My Account
		driver.findElement(By.linkText("My Account")).click();
		
		//click on Login
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));
		driver.findElement(By.linkText("Login")).click();
		
		//entering email
		
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("input-email"))).sendKeys("Mimichenait@gmail.com");
		
		//entering password
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("input-password"))).sendKeys("Mimichenait01");
		//click on Login
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.btn.btn-primary"))).click();
		
	}

}
