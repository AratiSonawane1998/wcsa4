package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assg6 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
    driver.findElement(By.xpath("//span[.='Allow']")).click();
	WebElement target = driver.findElement(By.xpath("//a[@title='Rings']"));
	Actions act = new Actions(driver);
	act.moveToElement(target).build().perform();
	Thread.sleep(2000);
	WebElement target1 = driver.findElement(By.xpath("//a[@title='Diamond Rings']"));
	act.doubleClick(target1).perform();
	//Thread.sleep(2000);
}
}
