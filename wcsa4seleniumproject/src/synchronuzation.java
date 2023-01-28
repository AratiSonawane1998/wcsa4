import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchronuzation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Arati");
		//Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.cssSelector("button[class*=' _acap _']")).click();//between attribute
		//Thread.sleep(2000);

}
}