package AssignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id3Locator {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
	//Thread.sleep(2000);
	Thread.sleep(2000);
	driver.findElement(By.id("glow-ingress-line2")).click();//responsible for id 0
	Thread.sleep(2000);
	driver.close();
}

}
