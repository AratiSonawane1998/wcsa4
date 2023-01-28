package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	
	driver.findElement(By.tagName("input")).sendKeys("aratisonawane");
	
}
}
