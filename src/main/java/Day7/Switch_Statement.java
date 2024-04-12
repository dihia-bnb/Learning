package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_Statement {

	public static void main(String[] args) {
		// switch statements is a multi-way branch statement
		//switch statements defines multople parts parts of execution of program
		//switch statements provides better alternative tha large series of if-else
		//"Browser Configurate With Selenium"
		switch ("Chrome") {
		case "Chrome": 
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			driver.close();
			break;
		case "FireFox": 
			WebDriver driver1 = new FirefoxDriver();
			driver1.manage().window().maximize();
			driver1.get("https://resdiff.com");
			driver1.close();
			break;
		case "Edge": 
			WebDriver driver2 = new EdgeDriver();
			driver2.manage().window().maximize();
			driver2.get("https://flipkart.com");
			driver2.close();
			break;
			
		
		default:
			WebDriver driver3 = new EdgeDriver();
			driver3.manage().window().maximize();
			driver3.get("https://bestbay.com");
			driver3.close();
		
		}
    }
}


