package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(how=How.XPATH, using="(//a[contains(text(),'Johny')])[2]")
	private WebElement lnkAccountName;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Account")
	private WebElement lnkAccount;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Logout")
	private WebElement lnkLogOut;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Home")
	private WebElement lnkHome;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Hotels")
	private WebElement lnkHotels;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Flights")
	private WebElement lnkFlights;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Tours")
	private WebElement lnkTours;
	
	HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
