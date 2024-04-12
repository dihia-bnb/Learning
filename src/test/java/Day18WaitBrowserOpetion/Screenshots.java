package Day18WaitBrowserOpetion;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshots {
	
	public WebDriver driver;
	/*
	@Test
	public void howToCaputerScreenShot() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		
		//Step1 : Identify the WebElement which you to take screenshot of 
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
		
		//Step2: Using the logo we will call a method know as getScreenshotAs
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//Where will you store this?
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\ScreenShot\\openweathermaplogo.png");
	
		//copy the source into the destination
		FileHandler.copy(source, destination);
		
		
	}*/
	

	@Test
	public void howToScreenShot() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://costco.com");
		
		//Step1 : Identify the WebElement which you to take screenshot of 
		WebElement logo = driver.findElement(By.xpath("(//img[@class='bc-logo logo-us'])[2]"));
		
		//Step2: Using the logo we will call a method know as getScreenshotAs
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//Where will you store this?
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\ScreenShot\\openweathermaplogo.png");
	
		//copy the source into the destination
		FileHandler.copy(source, destination);
		
		
	}

}
