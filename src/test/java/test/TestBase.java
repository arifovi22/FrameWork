package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import allPages.HomePage;





public class TestBase {
	
	private static TestBase instance;
	WebDriver driver;
	HomePage home;
	
	
	private TestBase() {
		
	}
	
	 
	
	public static TestBase getInstance() {
		if (instance == null) 
			instance = new TestBase();
		return instance;	
	}
	
	public void getDriver(String driverValue) {
		if (driverValue.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Arif\\eclipse project\\FrameWorkReview\\Browser\\chromedriver.exe");
			driver = new ChromeDriver(); 	
		}else if (driverValue.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Arif\\eclipse project\\FrameWorkReview\\Browser\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		}
		
		
		public HomePage getHome() {
			if (home == null) 
				home= new HomePage(driver);
			return home;
			
		}
		
		public void closeBrowser() {
		if (driver != null) 
			driver.close();
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	