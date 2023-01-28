package PageObjectMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//to avoid StaleReference Exception

	@FindBy(name="username")private WebElement UsernameTB;
	@FindBy(name="pwd")private WebElement Password;
	@FindBy(id="loginButton")private WebElement LoginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement LogInCheckBox;
	@FindBy(xpath ="//a[.=\"Actimind Inc.\"]")private WebElement ActiMindLink;
	@FindBy(id="licenseLink")private WebElement LisenceLink;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	
	public WebElement getUsernameTB() {
		return UsernameTB;
	}
	public void setUsernameTB(WebElement usernameTB) {
		UsernameTB = usernameTB;
	}
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(WebElement password) {
		Password = password;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//operational Method
	public void actiTimeLogin(String validUsername,String validPassword) throws InterruptedException
	{
	UsernameTB.sendKeys(validUsername);	
	Password.sendKeys(validPassword);
	Thread.sleep(2000);
	LoginButton.click();
	}
	
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		UsernameTB.sendKeys(invalidUsername);
		Thread.sleep(2000);
		Password.sendKeys(invalidPassword);
		Thread.sleep(2000);
		LoginButton.click();
		Thread.sleep(2000);
		UsernameTB.clear();
	}
}
