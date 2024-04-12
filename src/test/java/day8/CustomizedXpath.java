package day8;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		money();

	}
	public static void money() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
		driver.findElement(By.xpath("//div[@class='cell topicons']/descendant::a[2]")).click();
		driver.findElement(By.xpath("//a[@class='mailicon']/following-sibling::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='navbar']/preceding::a[text()='Money']")).click();
	} 

}
