package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ReportManager;

public class BasePage extends ReportManager{
	protected static WebDriver driver;
	protected WebDriverWait wait;
	public static String testcaseName;
	
	
	public  void setDriver(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(driver,1000);
	}
	
	public void waitForElement(WebElement element){
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
