package KeyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.annotation.Target;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_And_InspectSeleniumDevApp {
	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
	
		WebElement target =driver.findElement(By.xpath("//h1[.='Downloads']"));
		//object for actionclass
		Actions act = new Actions(driver);
	
		//Thread.sleep(2000);
		act.contextClick(target).perform();
		act.contextClick(target).perform();
		//obj for robot class
		Robot robot = new Robot();
		
		//loop use to press down keys 5 times
		for(int a=0; a<10;a++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(2000);
			
		}
		
		//click on inspectoption
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
