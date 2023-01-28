package MethodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod  {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.exe", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	WebElement UsernameTextbox = driver.findElement(By.name("username"));
	UsernameTextbox.sendKeys("Admin");
	Thread.sleep(2000);
	WebElement Password = driver.findElement(By.name("password"));
	Password.sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	

}
	
}
