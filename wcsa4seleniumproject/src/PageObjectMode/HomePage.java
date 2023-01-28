package PageObjectMode;

import java.awt.event.WindowEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[.=\"Logout\"]")
	private WebElement logoutLink;
	@FindBy(id = "SubmitTTButton")private WebElement SaveLea veTimeButton;
	@FindBy(xpath = "//a[@class=\"content users_selected selected\"]")
	private WebElement user;
	@FindBy(name = "usersSelector.selectedUser")private WebElement enterTimeTrackDropDown;

 //initialization
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}

}