package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction_To_Xpath {

	public static void main(String[] args) {
		//what is Xpath?
		//Address of a web Element
		
		//how many types of Xpath are there?
		//there are 2 types
		//i. Absolute Xpath
		//ii.Relative/dynamic/Customized Xpath
		
		//Which Xpath is more accurate?
		//Ans. Absolute Xpath is more accurate
		
		//Which Xpath is safe to use in automation?
		//Ans.Relative Xpath
		
		//1. //htmlTagn[@Attribute='value']
        //2. //htmlTagn[@Attribute1='value'and@Attribute2='value']
	    //3. //htmlTagn[@Attribute1='value'or@Attribute2='value']
	    //4. //htmlTagn[text()='value']
		//5. //htmlTagn[contains(text(),'value')] mostly used for the links
		//6. //htmlTagn[contains(@Attribute,'value')]  this is used for other WebElement
		//7. //htmlTagn[starts-with(@attribute,'startingvaluewhichisfixed')]
		//8. htmlTagn[ends-with(@attribute,'endingvaluewhichisfixed')]
		
		//Customized Xath 
		//paret
		//child
		//descendant
		//following-sibling
		//preceding-sibling
		//following
		//preceding
		//self
		
		
		
		
		
		
		
		
		
		
		
		/*
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
        // email: Mimichenait@gmail.com
		// pass: Mimichenait01
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		*/
		//useOfInCompoudeValuClass();
		
		xpathSytax4();
	
	}
	public static void useOfInCompoudeValuClass() {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
		driver.findElement(By.xpath("//a[@class='bmailicon relative']")).click();
	}
	public static void xpathSytax4() {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
		driver.findElement(By.xpath("//a[@class='bmailicon relative']")).click();
	}

}
