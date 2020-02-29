package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestLandingPage {
	
	TestBase instance;
	
	
	@Parameters({"driverValue"})
	@Test
	public void titleValidation(String driverValue) {
		instance = TestBase.getInstance();
		instance.getDriver(driverValue);
		instance.getHome().openUrl();
		String title = instance.getHome().validateLoge();
		System.out.println(title);
		Assert.assertEquals(title, "Walmart.com | Save Money. Live Better.");
		instance.closeBrowser();
		
	}
	
	
	
	
	

}
