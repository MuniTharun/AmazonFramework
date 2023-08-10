package test12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom1.Loginpage;
import pom1.Newpage;

public class ClassTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\Screenshots\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://online.actitime.com/marolix9/login.do");
		driver.manage().window().maximize();
		
		
		Loginpage Lp=new Loginpage(driver);
		Lp.SendUsername();
		Lp.SendPassword();
		Lp.ClickOnKeepSignin();
		Lp.ClickLoginButton();
		
		//Lp.ClickOnAllObjects();
		
		
		Newpage n=new Newpage(driver);
		
		n.TimeTrack();
		n.Task();
		n.Reports();
		n.Users();
		n.Logout();
	}

}
