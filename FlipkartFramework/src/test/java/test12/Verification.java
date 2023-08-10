package test12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom1.Loginpage;
import pom1.Newpage;

public class Verification {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//TestCase---1;
		
		driver.get("https://online.actitime.com/marolix9/login.do");
		Loginpage Lp=new Loginpage(driver);
		Lp.SendUsername();
		Lp.SendPassword();
		Lp.ClickOnKeepSignin();
		Lp.ClickLoginButton();
		
		//Lp.ClickOnAllObjects();
		
		
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
		Np.Logout();
		
		//TestCase---2
		driver.get("https://online.actitime.com/marolix9/login.do");
		Lp.SendUsername();
		Lp.SendPassword();
		Lp.ClickOnKeepSignin();
		Lp.ClickLoginButton();
		
		Np=new Newpage(driver);
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
		Np.Logout();
		
		//TestCase---3
				driver.get("https://online.actitime.com/marolix9/login.do");
				Lp.SendUsername();
				Lp.SendPassword();
				Lp.ClickOnKeepSignin();
				Lp.ClickLoginButton();
				
				Np=new Newpage(driver);
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
				Np.Logout();
				
				//TestCase----4
				driver.get("https://online.actitime.com/marolix9/login.do");
				Lp.SendUsername();
				Lp.SendPassword();
				Lp.ClickOnKeepSignin();
				Lp.ClickLoginButton();
				
				Np=new Newpage(driver);
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
				Np.Logout();
	

}
}
