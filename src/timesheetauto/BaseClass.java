package timesheetauto;

import org.testng.annotations.BeforeMethod;

public class BaseClass {

	@BeforeMethod
	public void initialize() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Neeraj\\Desktop\\Neha workspace\\JetliTransfer\\chrome\\chromedriver.exe");
	}
}
