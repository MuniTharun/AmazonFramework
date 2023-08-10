package pom1;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement Username;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement Password;
	
	@FindBy (xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement KeepLoggedIn;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement LogIn;
	
	@FindBy (xpath="commonfiles")
	private List<WebElement>ele;
	
	
	private WebDriver driver;
	private Actions act;
	private JavascriptExecutor js;
	private WebDriverWait wait;
	
		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
			act=new Actions(driver);
			js=(JavascriptExecutor)driver;
			this.driver=driver;
			wait=new WebDriverWait(driver, 20);
		}
		
		public void SendUsername() {
			act.moveToElement(Username).sendKeys("munitharun.marolix@gmail.com").build().perform();
			//Username.sendKeys("munitharun.marolix@gmail.com");
		}
		
		public void SendPassword() {
			wait.until(ExpectedConditions.visibilityOf(Password));
			Password.sendKeys("7J2zq@%h");
		}
		
		public void ClickOnKeepSignin() {
			KeepLoggedIn.click();
		}
		
		public void ClickLoginButton() {
			LogIn.click();
		}
		//public void ClickOnAllObjects() {
			//Username.sendKeys("munitharun.marolix@gmail.com");
			//Password.sendKeys("7J2zq@%h");
			//KeepLoggedIn.click();
			//LogIn.click();
		//}
		
}



