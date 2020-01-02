package timesheetauto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class timesheetauto1 {
	WebDriver driver;
	@BeforeMethod
	  public void verifyHomepageTitle() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Neeraj\\Desktop\\Neha workspace\\Timesheetautomation\\Chrome\\chromedriver.exe");
		  driver = new ChromeDriver();
			System.out.println("Before");
	  }
	@Test
	  public void Tes1() {
		
		System.out.println("dbkj");
		System.out.println("dbkj");
		System.out.println("dbkj22");
	}
	
	}
