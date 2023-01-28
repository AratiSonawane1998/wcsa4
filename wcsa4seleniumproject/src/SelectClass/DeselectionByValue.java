package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionByValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("file:///C:/Users/hp/Desktop/WCSA4/Multi.html");
	    WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='menu']"));
	    Select sal = new Select(dropdownElement);
	    Thread.sleep(2000);
	    sal.selectByValue("v5");
	    Thread.sleep(2000);
	    sal.deselectByValue("v5");
	}
}
