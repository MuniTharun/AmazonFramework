package pom1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Newpage {
	
	
	
	@FindBy(xpath="//div[@id='container_tt']")
	private WebElement TimeTrack;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement Task;
	
	@FindBy(xpath="//div[@id='container_reports']")
	private WebElement Reports;
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement Users;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement LogOut;
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions act;
	
	
public Newpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait=new WebDriverWait(driver, 20);
		act=new Actions(driver);
		
	}
	
	public void TimeTrack() {
		TimeTrack.click();
	}
	
	public void Task() {
		wait.until(ExpectedConditions.visibilityOf(Task));
		act.moveToElement(Task).click().build().perform();
	}
	
	public void Reports() {
		Reports.click();
	}
	
	public void Users() {
		Users.click();
	}
	
	public void Logout() {
		act.moveToElement(LogOut).click().build().perform();
	}

}

