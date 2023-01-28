package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/hp/Desktop/WCSA4/Alertpopup.html");
	
	WebElement button = driver.findElement(By.xpath("//button"));
	button.click();
	//now switch ur control to alert popup
	Alert a1 = driver.switchTo().alert();
	Thread.sleep(2000);
	//accept the alert popup
	//a1.accept();
	
	//dissmis popup
     //a1.dismiss(); throwa :=>//org.openqa.selenium.NoAlertPresentException : selenium exception
	
	//text of alert popup
	
	String textOfAlert = a1.getText();
	System.out.println(textOfAlert);
	
	//a1.sendKeys("admin"); throws :=>// org.openqa.selenium.ElementNotInteractableException
	
}
}
