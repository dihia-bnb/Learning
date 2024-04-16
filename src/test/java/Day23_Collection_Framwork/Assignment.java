package Day23_Collection_Framwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment {
	public static WebDriver driver;
	
	@Test
	public void assignment1() {
		String companyName = "Central Bank";
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> companyNames =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		for(int i=0; i<companyNames.size();i++) {
			if(companyName.equals(companyNames.get(i).getText())) {
				System.out.println(companyNames.get(i) +"---------->" + currentPrices.get(i).getText());
				break;
			}
		}
		
		
	}
	
	//1000th position
	@Test
	public void assignment2() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> companyNames =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
	    WebElement companyName=	driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1000]/td[4]"));
		String name = companyName.getText();
		System.out.println(name);
		
		for(int i=0; i<companyNames.size();i++) {
			if(name.equals(companyNames.get(i).getText())) {
				System.out.println(companyNames.get(i) +"---------->" + currentPrices.get(i).getText());
				break;
			}
		}
		
		
	}
	
	@Test
	public void assignment3() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> first5rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[position() > 0 and position() <= 5]"));
	     for(int i=0;i<first5rows.size();i++) {
	    	 System.out.println(first5rows.get(i).getText());
	     }
	     System.out.println("*************************************************************");
	
	     List<WebElement> midl5rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[position() > 200 and position() <= 205]"));
	     for(int i=0;i<midl5rows.size();i++) {
	    	 System.out.println(midl5rows.get(i).getText());
	     }
	     System.out.println("*************************************************************");
	
	     List<WebElement> last5rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[position() > 2189 and position() <= 2194]"));
	     for(int i=0;i<last5rows.size();i++) {
	    	 System.out.println(last5rows.get(i).getText());
	     }
	     System.out.println("*************************************************************");
	}
	
	//any  5 company
	@Test
	public void assignment4() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		String[] selectedCopmanies= {"Central Bank","Ram Info","HLV L","UCO Bank","CSB Bank"};
		
		List<WebElement> companyNames =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		for(int i=0; i<companyNames.size();i++) {
			for(String companyName : selectedCopmanies) {
				if(companyName.equals(companyNames.get(i).getText())) {
					System.out.println(companyNames.get(i).getText()+"-------------->" + currentPrices.get(i).getText());
					break;
				}
				
			}
		}
		
		
		
	}
	

}
