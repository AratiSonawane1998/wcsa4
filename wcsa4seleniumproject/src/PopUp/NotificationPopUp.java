package PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeOptions co=new ChromeOptions();
	
	//maximize browser without calling manage method
	co.addArguments("-start-maximized");
	
	co.addArguments("--disable-notification");

	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://in.puma.com/in/en?gclid=EAIaIQobChMIkJ34vYKw_AIV7JhmAh1bxQ80EAAYASAAEgIuP_D_BwE&utm_aud=MULT&utm_campaign=AFF_OTH_CPO_MULT_OLC_iCubesWire_616&utm_medium=AFF&utm_obj=OLC&utm_source=OTH-CPO");
	Thread.sleep(30);
	co.addArguments("--disable-notification");

}
}
