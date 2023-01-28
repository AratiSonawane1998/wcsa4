package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class youTubeFindElements {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./drivers.ChromeDriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.switchTo().activeElement().sendKeys("shorts");
	Thread.sleep(2000);
	List<WebElement> shorts = driver.findElements(By.xpath("//div[@class='3.9M views']"));
	System.out.println(shorts.size());
	for(WebElement s1 : shorts)
	{
	System.out.println(s1.getText());	
	
	}
}

}
