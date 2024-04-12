package Day4_Automation_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomationProgram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
         // Ctrl+Shift+O   TOGETHER
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://bestbuy.com/");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://rediff.com/");
		driver2.quit();
		
	}

}
