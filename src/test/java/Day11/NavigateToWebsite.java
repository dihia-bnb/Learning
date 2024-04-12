package Day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateToWebsite {

	
	@Test 
	public void openAllWebsite() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().to("https://www.flipkart.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.costco.com");
		driver.quit();
	}
}
