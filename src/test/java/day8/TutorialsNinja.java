package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {

	public static void main(String[] args) {

		//LoginTNUsigXpath();
		registerTNUsigXpath();
	}

	public static void LoginTNUsigXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mimichenait01");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

	}

	public static void registerTNUsigXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		// Click on My Account
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		// Click on Register
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		// Enter firstname..... select privacy checkkook
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dihia");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bounab");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Mimichenait@gmail.com");
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("5123799308");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mimichenait01");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Mimichenait01");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		/*
		
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("My Account")).click();
*/
	}

}
