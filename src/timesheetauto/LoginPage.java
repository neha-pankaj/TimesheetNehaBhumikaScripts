package timesheetauto;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LoginPage {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neerajtesting\\Desktop\\workspace\\Timesheet\\ChromeDriver2.36\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://1wayit.mydsr.co.in/");
		driver.manage().window().maximize();
		
	}

	@Test(priority=0)
	public void homePageLoadTest()
	{
		String actualTitle = "Login Panel";
		 Assert.assertEquals(driver.getTitle(), actualTitle,"Something wrong found at Login page");
		 System.out.println("Test");
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.fail("Failing first assertion");
		 softAssert.assertEquals("abc1", "abc");
	
	}
	/*@Test(priority=1)
	public void logoPresentTest()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		boolean logo=driver.findElement(By.xpath("/html/body/div/a/img")).isDisplayed();
		Assert.assertEquals(logo,true);
	}
	@Test(priority=2)
	public void validationWithoutInput() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
		String placeholder=driver.findElement(By.id("username")).getAttribute("placeholder");
		Assert.assertEquals(placeholder, "This Field is Required");
		
		
	}
	@Test(priority=3)
	public void forgotPasswordPresent()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Password ?')]")).click();
	}
	@Test(priority=4)
	public void rememberMeCheckboxPresent()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("remember me")).click();
	}
	@Test(priority=5)
	public void passwordEncryptedCheck()
	{
		String Password_type=driver.findElement(By.id("password")).getAttribute("type");
		if(Password_type.equalsIgnoreCase("password"))
		{
		}
	}
	@Test(priority=6)
	public void TermsofServicePresent()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("Terms of Service")).click();
	}
	@Test(priority=7)
	public void PrivacyPolicyPresent()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("Privacy Policy")).click();
	}
	@Test(priority=8)
	public void CopyrightPresent()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("Copyright ")).getText();
	}*/
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		driver.quit();
		
		
	}
}
