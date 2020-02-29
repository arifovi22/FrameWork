package allPages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Generic {
	String logoVisible ="//div//img[@alt='Icon for spark']";
	

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void openUrl() {
		getUrl("https://www.walmart.com/");
	}
	
	public String validateLoge() {
	String title = driver.getTitle();
		
		return title;
	}
	
	
	
	

}
