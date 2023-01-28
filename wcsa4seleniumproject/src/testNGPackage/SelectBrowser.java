package testNGPackage;

import java.sql.Driver;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SelectBrowser {
	WebDriver driver;
  @Test
 @Parameters({"browserValue","url"})
  public void openBrowser(String browser,String url) {
	 if(browser.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 
	 }
	 
  else if(browser.equals("firefox"))
  {
	  Reporter.log("");
  }   
  }
}
