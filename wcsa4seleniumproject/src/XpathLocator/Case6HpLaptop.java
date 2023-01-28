package XpathLocator;

import java.time.Duration;
//dependant Independant
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case6HpLaptop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("HP laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//driver.findElement(By.xpath("").sendkey();
		driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();	
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
	}

}
