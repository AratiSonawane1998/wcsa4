package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneFilterAssig {
	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		WebElement target = driver.findElement(By .xpath("//a[@title='Watch Jewellery']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[.='Band']")).click();
        //driver.findElement(By.id("confirmBtn")).click();
		WebElement clickAndHold = driver.findElement(By .xpath("//div[.='Filter by']"));
		
		for(int i=0;i<2;i++){
		act.clickAndHold().perform();
			}
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);	
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);	
		Thread.sleep(2000);
		WebElement serchBox = driver.findElement(By.name("submit_search")).click();
		
	}	
}
