package TestNGDay10;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_TestNG {

	@BeforeMethod
	public void setup() {
		System.out.println("This is just a before method logic");
	}
	@Test
	public void testCase1() {
		System.out.println("This is TC1"); 
	}
	@Test
	public void testCase2() {
		System.out.println("This is TC2"); 
	}
	@Test
	public void testCase3() {
		System.out.println("This is TC3"); 
	}
	@AfterMethod
	public void closing() {
		System.out.println("This has the after method logic");
	}
}
