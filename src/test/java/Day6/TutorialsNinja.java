package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {

	public static void main(String[] args) {
		//creatAccount();
		LoginWithTheCreateAccount();
	}

	public static void creatAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		// Click on My Account
		driver.findElement(By.linkText("My Account")).click();
		// Click on Register
		driver.findElement(By.linkText("Register")).click();
		// Enter firstname..... select privacy checkkook
		driver.findElement(By.id("input-firstname")).sendKeys("Dihia");
		driver.findElement(By.id("input-lastname")).sendKeys("Bounab");
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("5123799308");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.id("input-confirm")).sendKeys("Mimichenait01");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("My Account")).click();
		
	}

    //email: Mimichenait@gmail.com
	// pass: Mimichenait01
	public static void LoginWithTheCreateAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	
	
	
	}
}
