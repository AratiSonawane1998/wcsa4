package AssignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLocatorSyncronizationImplicitly {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDrievr.chrome.driver", "./Drivers/chromrdriver.exe");
		WebDriver driver = new ChromeDriver();// upcasted
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Arati");
		driver.findElement(By.name("password")).sendKeys("12345678");
		// driver.findElement(By.className("_acan _acap _acas")).click();
		driver.findElement(By.cssSelector("button[class^='oxd-button ']")).click();//initial
		Thread.sleep(2000);
		driver.close();
	}
}
