package Day18WaitBrowserOpetion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyBaord_Actions {
	public WebDriver driver;

	@Test
	public void loginTutorialsNinjaKeyBoard() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));

		Actions actions = new Actions(driver);
		actions.click(emailTextBox).sendKeys("mimichenait@gmail.com").perform();
		// now i want to cope the complete email
		// ctrl+A [this will select all]
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		// ctrl + C [copy the email]
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);

		// press the TAB so that the cursor will come to password TextBox
		actions.keyDown(emailTextBox,Keys.TAB).perform();
		// Ctrl + V[ paste the value]
		actions.keyDown(passwordTextBox, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		actions.keyDown(loginButton,Keys.TAB).perform();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
		driver.quit();
	}

}
