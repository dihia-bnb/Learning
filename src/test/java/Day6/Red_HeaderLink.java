package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_HeaderLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// Ctrl+Shift+O TOGETHER
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");

		// driver.findElement(By.linkText("Create Account")).click();
		// driver.findElement(By.partialLinkText("Create Acc")).click();

		

		// driver.findElement(By.linkText("Investors")).click();
		driver.findElement(By.partialLinkText("Inves")).click();
       /*
		// driver.findElement(By.linkText("Advertise with us")).click();
		driver.findElement(By.partialLinkText("Advertise with u")).click();

		// driver.findElement(By.linkText("Disclaimer")).click();
		driver.findElement(By.partialLinkText("Disclai")).click();

		// driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.partialLinkText("Priva")).click();
		
		 driver.findElement(By.linkText("")).click();
		driver.findElement(By.partialLinkText("")).click();
        */
	}

}
