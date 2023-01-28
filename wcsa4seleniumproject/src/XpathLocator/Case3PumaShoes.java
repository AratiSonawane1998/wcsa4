package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3PumaShoes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//h3[@class='tw-8216tu' and (contains(text(),'Softride Pro Coast'))]")).click();
		driver.findElement(By.xpath("//h3[@class='tw-f1zr7x' and (@title='Softride Pro Coast Training Shoes')]")).click();
	}
}
