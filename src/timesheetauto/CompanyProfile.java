package timesheetauto;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CompanyProfile {

	WebDriver driver;
	//ExtentTest test1;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\neerajtesting\\git\\MyRepos\\Timesheet\\ChromeDriver2.36\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://1wayit.mydsr.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Neeraj");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Company Profile')]")).click();
	}

	@Test(priority = 0)
	public void DetailButtonTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Choose Option ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Detail')]")).click();
		String actualTitle = "Company Details";
		Assert.assertEquals(driver.getTitle(), actualTitle);
		driver.findElement(By.xpath("//input[@value='Back']")).click();
	}
	@Test(priority = 1)
	public void EditButtonTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Choose Option ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		String actualTitle = "Edit Company Profile";
		Assert.assertEquals(driver.getTitle(), actualTitle);

	}
	@Test(priority = 2)
	public void CompanyInfoSaveButtonTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Choose Option ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.id("submit")).click();

	}
	@Test(priority = 3)
	public void CompanyProfileSaveButtonTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Choose Option ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//a[@class='nav-item nav-link'][contains(text(),'Profile')]")).click();
		driver.findElement(By.id("submit")).click();

	}
	@Test(priority = 4)
	public void CompanyInfoCancelButtonTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Choose Option ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//input[@value='Cancel']")).click();

	}
	@Test(priority = 5)
	public void CompanyProfileCancelButtonTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Choose Option ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//a[@class='nav-item nav-link'][contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//input[@value='Cancel']")).click();

	}
	
	@Test(priority = 6)
	public void CompanyInfoFieldsTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String CompanyName = null;
		String EmailAddress = null;
		String PhoneNo = null;
		
		CompanyName=driver.findElement(By.xpath("//tr[@class='odd gradeX']/td[2]")).getText();
		EmailAddress=driver.findElement(By.xpath("//tr[@class='odd gradeX']/td[3]")).getText();
		PhoneNo=driver.findElement(By.xpath("//tr[@class='odd gradeX']/td[4]")).getText();
		
		driver.findElement(By.xpath("//button[contains(text(),'Choose Option ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		String A = null;
		String B = null;
		String C = null;
		try {
			A = driver.findElement(By.id("companyName")).getAttribute("value");
			driver.findElement(By.id("companyName")).clear();
			driver.findElement(By.id("submit")).click();
			Assert.assertEquals(A, CompanyName);
			
			B=driver.findElement(By.id("companyEmailAddress")).getAttribute("value");
			driver.findElement(By.id("companyEmailAddress")).clear();
			driver.findElement(By.id("submit")).click();
			Assert.assertEquals(B, EmailAddress);
			
			C=driver.findElement(By.id("companyPhoneNumber")).getAttribute("value");
			driver.findElement(By.id("companyPhoneNumber")).clear();
			driver.findElement(By.id("submit")).click();
			Assert.assertEquals(C, PhoneNo);
			
			} catch (Exception e) {
			System.out.println("inside Catch-----------------------------------");
			System.out.println(e);
			driver.findElement(By.id("companyName")).sendKeys(A);
			driver.findElement(By.id("companyEmailAddress")).sendKeys(B);
			driver.findElement(By.id("companyPhoneNumber")).sendKeys(C);
			driver.findElement(By.id("submit")).click();
			System.out.println("close Catch-----------------------------------");
			System.out.println("test");
			}

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();

	}

}
