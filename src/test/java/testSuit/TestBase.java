package testSuit;

import org.testng.annotations.Test;

import cusomFactory.BrowserFactory;
import pageFactory.BasePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class TestBase {
	public static String URL="http://www.phptravels.net/";

  @BeforeMethod
  public void beforeMethod(ITestResult testCaseName) {
	  String testCase=testCaseName.getMethod().getMethodName();
	  
	  BrowserFactory.launchBrowser("Chrome");
	  BrowserFactory.loadURL(URL);
	  BasePage.testcaseName=testCase;
	  
  }

  @AfterMethod
  public void afterMethod() {
	  BrowserFactory.closeBrowser();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
