package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedIffWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
		
		//we want to click on sign in link - isDisplayed() , isEnabled() , isSelected()
		
		WebElement signinlink = driver.findElement(By.className("signin"));
		if(signinlink.isDisplayed()&& signinlink.isEnabled()) {
			signinlink.click();
		}else {
			System.out.println("The signinlink is not enable or not displayed");
		}
		
		WebElement keepmesignedinCheckBox  = driver.findElement(By.id("remember"));
		System.out.println(keepmesignedinCheckBox.isSelected());

	}

}
