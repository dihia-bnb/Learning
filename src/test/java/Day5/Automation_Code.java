package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Code {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        // Ctrl+Shift+O   TOGETHER
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
        // email: Mimichenait@gmail.com
		// pass: Mimichenait01
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
		
		
		//driver.quit();
		

	}

}
