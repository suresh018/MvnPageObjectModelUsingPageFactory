package testcases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverScript {
  @Test
  public void function() {
	  System.out.println("Demo TestNG.");
	  System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver_win32_2\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  try {
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8897425657");
		driver.close();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
