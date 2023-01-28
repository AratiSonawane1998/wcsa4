package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartSynhronization {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("Webdriver.chrome.driver", "./drievrs/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("https://www.flipkart.com/")).click();
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		driver.findElement(By.xpath("//a[.='Login']")).click();
	}
}
