package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FameById {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/WCSA4/frame.html");
		driver.switchTo().frame(0);
		WebElement usn = driver.findElement(By.id("id2"));
		usn.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.id("id1"));
		psw.sendKeys("manager");
		

	}

}
