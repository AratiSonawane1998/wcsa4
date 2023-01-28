package MethodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com/accounts/login/");
		 
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("aratojk@");
		driver.findElement(By.name("password")).sendKeys("1236548");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean status = loginButton.isEnabled();
		System.out.println(status);
		
	}
}
