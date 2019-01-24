package cusomFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import configurations.InputValues;
import pageFactory.BasePage;

public class BrowserFactory {

	private static WebDriver driver;
	public static void launchBrowser(String browser) {
		switch(browser.toLowerCase()){
			case "chrome":
				System.setProperty("webdriver.chrome.driver",InputValues.getChromeDriverPath());
				driver=new ChromeDriver();
				
				break;
			case "firefox":
				System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver_win32_2\\chromedriver.exe");
				driver=new FirefoxDriver();
				break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BasePage basepage=new BasePage();
		basepage.setDriver(driver);
		
	}
	public static void loadURL(String url) {
		driver.get(url);
	}
	public static void closeBrowser() {
		driver.quit();
	}
}
