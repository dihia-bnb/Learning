package Batch_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {
public WebDriver driver;
	
	@Test
	public void answer1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//getTitle
		String acctualTitle=driver.getTitle();
		System.out.println("Title is :"+acctualTitle);
		String expectedTitle="Swag Labs";
		Assert.assertEquals(acctualTitle, expectedTitle);
		//getCurrentUrl
		String currentUrl=driver.getCurrentUrl();
		System.out.println("URL is : "+currentUrl);
		String expectedUrl="https://www.saucedemo.com/";
		Assert.assertEquals(currentUrl, expectedUrl);
		
		WebElement usernameTextBox = driver.findElement(By.id("user-name"));
		if(usernameTextBox.isDisplayed()) {
			usernameTextBox.sendKeys("standard_user");
		}else {
			System.out.println("the textbox is not visible");
		}
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		if(passwordTextBox.isDisplayed()) {
			passwordTextBox.sendKeys("secret_sauce");
		}else {
			System.out.println("the textbox is not visible");
		}
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		if(loginButton.isDisplayed()) {
			loginButton.click();
		}else {
			System.out.println("the button is not visible");
		}
		
	}
	
	public static void main(String[] args) {
		 //4= 2+3 just change j to 4
		for(int i=1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print( "* ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j = 4; j>=i; j--) {
				System.out.print( "* ");	
			}
			System.out.println();
		}

	}
}
