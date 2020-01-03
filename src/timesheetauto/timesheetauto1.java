package timesheetauto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class timesheetauto1 {
	WebDriver driver;
	    @BeforeMethod
	    public void verifyHomepageTitle() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neeraj\\Desktop\\Neha workspace\\Timesheetautomation\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://1wayit.mydsr.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@786");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='alllisting']/div/table/tbody/tr[1]/td[5]/div/button")).click();
		driver.findElement(By.xpath("//*[@id='alllisting']/div/table/tbody/tr[1]/td[5]/div/ul/li[1]/a")).click();
	  }
	String ErrorMsgCphone="Please enter a company Phone Number";
	String ErrorMsgCName="Please enter your company name";
	@Test
	  public void VerifyMandatoryfield() {
		driver.findElement(By.xpath("//*[@id='companyPhoneNumber']")).clear();
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		String ErrorMsgCphone=driver.findElement(By.xpath("//*[@id='CompanyInfo']/div[2]/div[1]/div/label[2]")).getText();
		System.out.println(ErrorMsgCphone);
		String ErrorMsgCphone1=driver.findElement(By.xpath("//*[@id='CompanyInfo']/div[2]/div[1]/div/label[2]")).getText();
		Assert.assertEquals(ErrorMsgCphone1, ErrorMsgCphone, "msg");
		System.out.println("bvfchdvf");
		
	}
	
	}
