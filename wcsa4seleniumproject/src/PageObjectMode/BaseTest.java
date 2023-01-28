package PageObjectMode;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant { 
//contains all non static methods
//use to open and close the browser
	static WebDriver driver;

	public void openBrowser(String url) throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
	
		

		if (browserValue.equals("chrome")) {
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);

		} else if (browserValue.equals("firefox")) {
			System.setProperty("GECKO_KEY", "GECKO_VALUE");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		 }

		else {
			System.out.println("enter the valid browserValue!!!");
		}
	}

	public void closeBrowser() {
		driver.quit();
	}

}
