package Day20;

import org.testng.annotations.Test;

public class SanityTesting {

	
	@Test(priority = 1)
	public void test7() {
		System.out.println("Sanity Test 1");
	}
	
	@Test(priority = 2)
	public void test8() {
		System.out.println("Sanity Test 2");
	}
	
	@Test(priority = 3)
	public void test9() {
		System.out.println("Sanity Test 3");
	}
}
