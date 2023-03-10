package ActionsClass;

import java.lang.annotation.Target;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MoveToElementMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.id("confirmBtn")).click();
	WebElement target = driver.findElement(By .xpath("//a[@title='Watch Jewellery']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(target).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Band']")).click();
	
}
}
