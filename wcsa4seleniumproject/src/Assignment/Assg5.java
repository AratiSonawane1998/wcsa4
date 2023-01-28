package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assg5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.Chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//span[.='Allow']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Rings']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Diamond Rings']")).click();
	Thread.sleep(2000);
	WebElement dropdownElement = driver.findElement(By.xpath(""));
	Select sal = new Select(dropdownElement);
	for(int i=0; i>5; i++)
	{
		sal.selectByIndex(3);
		Thread.sleep(2000);
	}
}
}
