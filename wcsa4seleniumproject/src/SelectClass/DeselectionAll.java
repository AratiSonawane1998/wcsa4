package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionAll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("file:///C:/Users/hp/Desktop/WCSA4/Multi.html");
	    WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='menu']"));
	    Select sal = new Select(dropdownElement);
	    
	    for(int i=0;i<6;i++)
	    {
	      sal.selectByIndex(i);
	      Thread.sleep(4000); 
	    }
	    sal.deselectAll();
}
}
