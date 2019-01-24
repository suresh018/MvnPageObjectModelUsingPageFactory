package testSuit;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageFactory.LoginPage;

public class DriverScript extends TestBase{
  @Test
  public void Test_1010() {
	  System.out.println("Demo TestNG.");
	  LoginPage loginPage=new LoginPage();
	  loginPage.logIn();


  }
  @Test
  public void Test_1011() {
	  System.out.println("Demo TestNG.");
	  LoginPage loginPage=new LoginPage();
	  loginPage.logIn();


  }
}
