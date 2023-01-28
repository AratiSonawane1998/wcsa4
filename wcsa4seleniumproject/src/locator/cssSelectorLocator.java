package locator;
//orangeHrm
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
		WebDriver driver=new ChromeDriver();//upcasted
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//driver.findElement(By.name("")).sendKeys("Arati");
		//driver.findElement(By.name("")).sendKeys("12345678");
		//driver.findElement(By.className("_acan _acap _acas")).click();
		driver.findElement(By.cssSelector("button[class^='_2KpZ6l _']")).click();//Initial attribute
		Thread.sleep(2000);
		driver.close();
}

}
