package Day4_Automation_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        // Ctrl+Shift+O   TOGETHER
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		//driver.quit();
	}

}
