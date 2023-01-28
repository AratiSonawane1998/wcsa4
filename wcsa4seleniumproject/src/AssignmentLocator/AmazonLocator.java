package AssignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
		WebDriver driver=new ChromeDriver();//upcasted
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("aqwerd@gamil.com");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
