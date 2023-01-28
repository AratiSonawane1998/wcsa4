package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class findElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.ext");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		System.out.println(suggestions.size());
		
		for(WebElement s: suggestions)
		{
            Thread.sleep(2000);    
			System.out.println(s.getText());
		}

	}
}

