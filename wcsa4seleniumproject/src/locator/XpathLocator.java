package locator;
//case1
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
		WebDriver driver=new ChromeDriver();//create obj of web driver
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Arati");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
