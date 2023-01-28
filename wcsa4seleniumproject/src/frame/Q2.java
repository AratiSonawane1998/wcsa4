package frame;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	//how to close parent and child browser without using quit()
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("http://omayo.blogspot.com/");
			driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
			String parentHandle = driver.getWindowHandle();
			Thread.sleep(2000);
			Set<String> allHandles = driver.getWindowHandles();
			for(String al:allHandles)
			{
				driver.switchTo().window(al).close();
			}
		}
}
