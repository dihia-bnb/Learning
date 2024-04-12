package Day15_Data_driven;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registe_DataDriven  extends TestBase{
	public Registe_DataDriven() throws Exception {
		super();
		
	}

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	
	@BeforeMethod
	public void setup() {
		driver = initalizeBrowserAndOpenApplication("Chrome");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();	
	}

	
	@Test(priority=1)
	public void registerCode() {
		
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
		driver.findElement(
				By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input"))
				.click();
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@Test(priority=2)
	public void registerAccountWithoutEnteringAnyDetails() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualPrivacyPolicyWarningMessage = driver
				.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = prop.getProperty("privacyPolicyWarningMessage");
		Assert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage));

	}
	
	public void closeBrowser() {
      driver.close();
	}

}
