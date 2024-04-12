package Day9th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinja_scc {

	public static void main(String[] args) {
		//LoginTNUsigXpath();
		registerTNUsigXpath();

	}
	public static void LoginTNUsigXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.cssSelector("div#top-links ul>li+li.dropdown a.dropdown-toggle")).click();
		driver.findElement(By.cssSelector("div#top-links ul>li+li.dropdown ul li+li a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("div.form-group+div+input")).click();

	}

	public static void registerTNUsigXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		// Click on My Account
		driver.findElement(By.cssSelector("div#top-links ul>li+li.dropdown a.dropdown-toggle")).click();
		// Click on Register
		driver.findElement(By.cssSelector("div#top-links ul>li+li.dropdown ul li:nth-child(1) a")).click();
		// Enter firstname..... select privacy checkkook
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Dihia");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Bounab");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5123799308");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Mimichenait01");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("a.agree+input+input")).click();
		/*
		
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("My Account")).click();
*/
	}

}
