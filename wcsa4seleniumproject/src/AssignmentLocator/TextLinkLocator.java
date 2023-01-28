package AssignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLinkLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDrievr.chrome.driver", "./Drivers/chromrdriver.exe");
		WebDriver driver = new ChromeDriver();// upcasted
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		Thread.sleep(2000);
		driver.findElement(By.linkText("data-csa-c-slot-id")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
