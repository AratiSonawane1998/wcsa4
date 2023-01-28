package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("ebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
		WebDriver driver=new ChromeDriver();//upcasted
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Chandler Bing",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("yKMVIe")).click();
		Thread.sleep(4000);
		driver.close();

}
}
