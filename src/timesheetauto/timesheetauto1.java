package timesheetauto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class timesheetauto1 extends BaseClass {
	WebDriver driver;
	    @BeforeMethod
	    public void verifyHomepageTitle() {
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
		driver.findElement(By.xpath("//*[@id='companyName']")).clear();
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		String ErrorMsgCName=driver.findElement(By.xpath("//*[@id='CompanyInfo']/div[1]/div[1]/div/label[2]")).getText();
		System.out.println(ErrorMsgCphone);
		String ErrorMsgCName1=driver.findElement(By.xpath("//*[@id='CompanyInfo']/div[1]/div[1]/div/label[2]")).getText();
		Assert.assertEquals(ErrorMsgCName1, ErrorMsgCName, "msg1");
	}
	@Test
	  public void VerifyCompanyPhnumfield () {
		  driver.findElement(By.xpath("//*[@id='alllisting']/div/table/tbody/tr[1]/td[5]/div/button")).click();
	      driver.findElement(By.xpath("//a[@href='https://1wayit.mydsr.co.in/timesheet_report/edit/1']")).click();
	      
	      boolean b;
	    		  try {
	    			  driver.findElement(By.xpath("//*[@id='companyPhoneNumber']")).clear();
	    			  driver.findElement(By.xpath("//*[@id='companyPhoneNumber']")).sendKeys("fjhfjhfhhjfjh()*(*");
	    			  String val=driver.findElement(By.xpath("//*[@id='companyPhoneNumber']")).getAttribute("value");
	    			  if(val.isEmpty())
	    			  {
	    				  driver.findElement(By.xpath("jhgjhjgj")).clear();
	    			  }
	    			  System.out.println(val);
	    			  System.out.println("try");
	    			  Thread.sleep(5000);
	    			  b=false;
				} catch (Exception e) {
					System.out.println("catch");
					b=true;
				}
	    		  driver.findElement(By.xpath("//*[@id='companyPhoneNumber']")).sendKeys("gfsfs*&&");
	    		  Assert.assertEquals(b, true);
	}
	@Test
	  public void VerifyZipCodefield () {
		System.out.println("test");
		
		
	}
	}
