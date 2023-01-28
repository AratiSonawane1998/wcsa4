package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	driver.close();
	
}
}
