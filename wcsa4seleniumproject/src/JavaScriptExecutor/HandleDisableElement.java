package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElement {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("file:///C:/Users/hp/Desktop/WCSA4/Text.html");
		    WebElement username = driver.findElement(By.id("i1"));
		    WebElement password = driver.findElement(By.id("i2"));
		    
		     JavascriptExecutor jse = (JavascriptExecutor)driver;
		     if(username.isEnabled())
		     {
		    	 username.sendKeys("admin");
		    	 password.sendKeys("manager");
		    	 System.out.println("if bloick is executed");
		     }
		
		     else
		     {
		    	 jse.executeScript("document.getElementById('i1').value='admin'");
		    	 jse.executeScript("document.getElementById('i2').value='manager'");
		    	 System.out.println("else block is executed");
		     }
		    
			Thread.sleep(2000);
			
}
	
	}