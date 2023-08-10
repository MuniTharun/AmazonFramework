package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Pojo {
	public static WebDriver openChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
public static WebDriver openFirefoxBrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\selenium files\\geckodriver-v0.33.0-win32\\geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    return driver;
}
public static WebDriver openOperaBrowser() {
	System.setProperty("webdriver.opera.driver", "C:\\selenium files\\operadriver_win64\\operadriver.exe");
    WebDriver driver=new OperaDriver();
    return driver;
}
public static WebDriver EdgeBrowser() {
	System.setProperty("webdriver.edge.driver", "C:\\selenium files\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    return driver;
}
	

}
