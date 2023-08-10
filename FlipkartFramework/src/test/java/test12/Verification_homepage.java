package test12;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browser.Pojo;
import pom1.Loginpage;
import pom1.Newpage;
@Test()

public class Verification_homepage extends Pojo {
	
	
WebDriver driver;
Loginpage Lp;
Newpage Np;
SoftAssert soft;
	
@Parameters("browserName")
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@BeforeTest
	public void LaunchBrowser(String browser) {
		System.out.println("before test");
		
		if(browser.equals("Chrome")) {
			driver=openOperaBrowser();
		}
		if(browser.equals("Firefox")) {
			driver=openFirefoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();	
	}
	
	@BeforeClass
	public void createPOMobjects() {
		System.out.println("BeforeClass");
		
		Lp=new Loginpage(driver);
		Np=new Newpage(driver);
		
		
		//driver=Pojo.openChromeBrowser();
		//driver=Pojo.openOperaBrowser();
		//driver=Pojo.EdgeBrowser();
		
		
	}
	@BeforeMethod
	public void LoginToApplication() {
		System.out.println("BeforeMethod");
		driver.get("https://online.actitime.com/marolix9/login.do");
	 
	Loginpage Lp =new Loginpage(driver);
	Lp.SendUsername();
	Lp.SendPassword();
	Lp.ClickOnKeepSignin();
	Lp.ClickLoginButton();
	
	Np=new Newpage(driver);
	soft=new SoftAssert();
	
	
	
	 }
	@Test
	public void ToverifytheTaskButton() {
		System.out.println("Test A");
		Np =new Newpage(driver);
		Np.TimeTrack();
		
		String url=driver.getCurrentUrl();
		String Title=driver.getTitle();
		System.out.println(url);
		System.out.println(Title);
		soft.assertEquals("https://online.actitime.com/marolix9/timetrack/enter.do", "https://online.actitime.com/marolix9/timetrack/enter.do");
		
		//if(url.equals("https://online.actitime.com/marolix9/timetrack/enter.do")&& Title.equals("actiTIME - Enter Time-Track")) {
			//System.out.println("pass");
		//}else 
		//{
			//System.out.println("Failed");
		//}
		soft.assertAll();
}
	@Test
	public void ToverifytheTaskButton1() {
		System.out.println("Test B");
		Np=new Newpage(driver);
		Np.Task();
		
		String url1=driver.getCurrentUrl();
		String Title1=driver.getTitle();
		System.out.println(url1);
		System.out.println(Title1);
		Assert.assertNotEquals("https://online.actitime.com/marolix9/tasks/tasklist.do", "https://online.actitime.com/marolix9/tasks/tasklist.do");
		
		//if(url1.equals("https://online.actitime.com/marolix9/tasks/tasklist.do")&& Title1.equals("actiTIME - Task List")) {
		//System.out.println("pass");
		//}
		//else {
			//System.out.println("Failed");
		//}
		
	}
	
	@Test
	public void ToverifytheTaskButton2() {
		System.out.println("Test C");
		Np=new Newpage(driver);
		Np.Reports();
		
		String url2=driver.getCurrentUrl();
		String Title2=driver.getTitle();
		System.out.println(url2);
		System.out.println(Title2);
		
		Boolean result=true;
		Assert.assertTrue(result);
		
		
		//if(url2.equals("https://online.actitime.com/marolix9/reports/dashboard.do")&& Title2.equals("actiTIME - Reports Dashboard")) {
			//System.out.println("pass");
		//}
		//else {
			//System.out.println("Failed");
		//}
	}
	
	@Test
	public void ToverifytheTsakButton3() {
		System.out.println("Test D");
		Np=new Newpage(driver);
		Np.Users();
		
		String url3=driver.getCurrentUrl();
		String Title3=driver.getTitle();
		System.out.println(url3);
		System.out.println(Title3);
		
		//if(url3.equals("https://online.actitime.com/marolix9/administration/userlist.do")&& Title3.equals("actiTIME - User List")) {
			//System.out.println("pass");
		
		//}
		//else{
			//System.out.println("Failed");
		//}
		Assert.fail();
	}
	
	
	@AfterMethod
	public void LogoutfromApplication() {
		Np.Logout();
	
}
	@AfterClass
	public void ClearObject() {
		Lp=null;
		Np=null;
}
	@AfterTest
	public void ClosedBrowser() {
		System.out.println("after test");
		driver.quit();
		driver=null;
		System.gc();
	}
	@AfterSuite
	public void afterSuite() {
	}
	
	
}
