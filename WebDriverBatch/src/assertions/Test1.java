package assertions;

import org.testng.Assert;

public class Test1 {

	public static void main(String[] args) {
		
		

	}
	
	void demoTest() {
		Assert.assertTrue(true);
		Assert.assertEquals("welcome", "Welcome");
		Assert.assertEquals("Selenium", "Selenium");
		System.out.println("Successfully - passed");
		
	}

}
