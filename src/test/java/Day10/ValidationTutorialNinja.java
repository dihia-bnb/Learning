package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationTutorialNinja {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		//Title of the page
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Your Store";
		
		//Current of the webpage - this is the second validation which 
		String actualCurrentUrl =driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl="https://tutorialsninja.com/demo/";
		
		if (expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			
		}else {
			System.out.println("The title is incorrect  " );
		}
		
		String actualLoginPageTitle =driver.getTitle();
		System.out.println(actualLoginPageTitle);
		String expectedLoginPageTitle="Account Login";
		
		String actualLoginPageCurrentUrl =driver.getCurrentUrl();
		System.out.println(actualLoginPageCurrentUrl);
		String expectedLoginPageCurrentUrl="https://tutorialsninja.com/demo/index.php?route=account/login";
		
		if (actualLoginPageTitle.equals(expectedLoginPageTitle) && actualLoginPageCurrentUrl.equals(expectedLoginPageCurrentUrl)) {
			driver.findElement(By.id("input-email")).sendKeys("Mimichenait@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Mimichenait01");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

			
		}else {
			System.out.println("The title and current url of login are incorrect  " );
		}
		
	}

}
