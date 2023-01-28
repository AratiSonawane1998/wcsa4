package Mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FindElementsForPoha {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("poha");
		
	   Thread.sleep(2000);
	   List<WebElement> sugg = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	   System.out.println(sugg.size());
	   
	   for(WebElement s: sugg)
	   {
		   Thread.sleep(2000);
		   System.out.println(s.getText());
	   }
}
}