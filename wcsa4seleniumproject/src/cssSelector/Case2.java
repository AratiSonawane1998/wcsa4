package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDrievr.chrome.driver", "./Drivers/chromrdriver.exe");
		WebDriver driver = new ChromeDriver();// create obj of web driver
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.jsp");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[.='username']")).sendKeys("Minakshi");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Minakshi");
		//driver.findElement(By.xpath("//input[.='pwd']")).sendKeys("123125678");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("123125678");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[.=' Login ']")).click();
		driver.findElement(By.xpath("//button[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.close();
}
}
