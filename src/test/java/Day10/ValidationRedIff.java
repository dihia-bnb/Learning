package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationRedIff {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
		
		//Title of the page
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		//Current of the webpage - this is the second validation which 
		String actualCurrentUrl =driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl="https://rediff.com/";
		
		if (expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.className("signin")).click();
			
		}else {
			System.out.println("The title is incorrect  " );
		}

	}

}
