package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Sign_Locator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
        // email: Mimichenait@gmail.com
		// pass: Mimichenait01
		driver.findElement(By.className("signin")).click();
		
		driver.findElement(By.id("login1")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();

	}

}
