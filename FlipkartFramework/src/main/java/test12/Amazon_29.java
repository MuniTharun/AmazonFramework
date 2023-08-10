package test12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom1.Loginpage;
import pom1.Newpage;


public class Amazon_29 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
	}
	@BeforeTest
	public void beforeTest() {
	}
	
	@BeforeClass
	public void LaunchBrowserCode() {
		System.out.println("beforeclass");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	@BeforeMethod
	public void LoginToApplication() {
		System.out.println("BeforeMethod");
		driver.get("https://online.actitime.com/marolix9/login.do");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	 
	Loginpage Lp =new Loginpage(driver);
	Lp.SendUsername();
	Lp.SendPassword();
	Lp.ClickOnKeepSignin();
	Lp.ClickLoginButton();
	
	
	 }
	@Test
	public void ToverifytheTaskButton() {
		System.out.println("Test A");
		Newpage Np =new Newpage(driver);
		Np.TimeTrack();
		
		String url=driver.getCurrentUrl();
		String Title=driver.getTitle();
		System.out.println(url);
		System.out.println(Title);
		if(url.equals("https://online.actitime.com/marolix9/timetrack/enter.do")&& Title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("pass");
		}else 
		{
			System.out.println("Failed");
		}		
}
	@Test
	public void ToverifytheTaskButton1() {
		System.out.println("Test B");
		Newpage Np=new Newpage(driver);
		Np.Task();
		
		String url1=driver.getCurrentUrl();
		String Title1=driver.getTitle();
		System.out.println(url1);
		System.out.println(Title1);
		
		if(url1.equals("https://online.actitime.com/marolix9/tasks/tasklist.do")&& Title1.equals("actiTIME - Task List")) {
		System.out.println("pass");
		}
		else {
			System.out.println("Failed");
		}
		
	}
	
	@Test
	public void ToverifytheTaskButton2() {
		System.out.println("Test C");
		Newpage Np=new Newpage(driver);
		Np.Reports();
		
		String url2=driver.getCurrentUrl();
		String Title2=driver.getTitle();
		System.out.println(url2);
		System.out.println(Title2);
		if(url2.equals("https://online.actitime.com/marolix9/reports/dashboard.do")&& Title2.equals("actiTIME - Reports Dashboard")) {
			System.out.println("pass");
		}
		else {
			System.out.println("Failed");
		}
	}
	
	@Test
	public void ToverifytheTsakButton3() {
		System.out.println("Test D");
		Newpage Np=new Newpage(driver);
		Np.Users();
		
		String url3=driver.getCurrentUrl();
		String Title3=driver.getTitle();
		System.out.println(url3);
		System.out.println(Title3);
		if(url3.equals("https://online.actitime.com/marolix9/administration/userlist.do")&& Title3.equals("actiTIME - User List")) {
			System.out.println("pass");
		
		}
		else{
			System.out.println("Failed");
		}
	}
	
	
	@AfterMethod
	public void afterMethod() {
		Newpage Np=new Newpage(driver);
		Np.Logout();
	
}
	@AfterClass
	public void afterClass() {
		driver.quit();
}
	@AfterTest
	public void afterTest() {
	}
	@AfterSuite
	public void afterSuite() {
	}
	
	
}
