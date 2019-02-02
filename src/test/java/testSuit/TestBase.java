package testSuit;

import org.testng.annotations.Test;


import cusomFactory.DriverFactory;
import pageFactory.BasePage;
import utilities.ReportManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class TestBase extends ReportManager{
	public static String URL="http://www.phptravels.net/";


	  @BeforeClass
	  public void beforeClass() {
		  initReport();
		  
	  }
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser,ITestResult testCaseName) {		
		String testCase=testCaseName.getMethod().getMethodName();
		startTest(testCase);
		DriverFactory.launchBrowser(browser);
		DriverFactory.loadURL(URL);
		BasePage.testcaseName=testCase;
	  
	}

  @AfterMethod
  public void tearDown(ITestResult testCaseName) {
	  DriverFactory.closeBrowser();
	  endTest();
  }



  @AfterClass
  public void afterClass() {
	  terminateReport();
  }

}
