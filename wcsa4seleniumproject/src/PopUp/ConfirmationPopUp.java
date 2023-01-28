package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/hp/Desktop/WCSA4/confirmation.html");
	
	WebElement button = driver.findElement(By.xpath("//button[.='click me! ']"));
	button.click();
	//now switch ur control to confirmation popup
	Alert a1 = driver.switchTo().alert();
	Thread.sleep(2000);
    //accept the confirmation popup
	a1.accept();
	
	//dismiss 
	a1.dismiss();
	
	String textOfAlert = a1.getText();
	System.out.println(textOfAlert); // throwa :=>//org.openqa.selenium.NoAlertPresentException : selenium exception
}
}