package Day18WaitBrowserOpetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hindling_Frames {

	public WebDriver driver;
	@Test
	public void manageingFrames() {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://rediff.com");
		// driver.get("https://tutorialsninja.com/");
		 //Find out total no of frames 
		 //html tag frames is iframes
		 
		 List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		 System.out.println("Total number or frames in rediff home page is : " + allFrames.size());
		 
		 //There are 10 frames.
		 //Let's say there is a button which is not clicking directly because it is under a fram. so first we handle the frame
		 
		 driver.switchTo().frame(5);
		 driver.findElement(By.id("")).click();
		 
		 //you have to come back to your normal position
		 driver.switchTo().defaultContent();
		 
		 
		 
		 
	}
	
}
