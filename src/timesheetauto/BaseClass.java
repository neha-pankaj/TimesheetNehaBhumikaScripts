package timesheetauto;

import org.testng.annotations.BeforeMethod;

public class BaseClass {

	@BeforeMethod
	public void initialize() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\neerajtesting\\git\\MyRepos\\Timesheet\\ChromeDriver2.36\\chromedriver.exe");
	}
}
