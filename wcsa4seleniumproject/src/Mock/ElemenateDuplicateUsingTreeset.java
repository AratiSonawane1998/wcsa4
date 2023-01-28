package Mock;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElemenateDuplicateUsingTreeset {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/hp/Desktop/WCSA4/Multi.html");
		WebElement dropDown = driver.findElement(By.id("menu"));
		Select sal = new Select(dropDown);
		
		List<WebElement> alloptions = sal.getAllSelectedOptions();
		TreeSet<String> s = new TreeSet<String>();
		LinkedList<String> s1 = new LinkedList<String>();
		for(int i=0;i<alloptions.size();i++)
		{
			WebElement opts = alloptions.get(i);
			String values = opts.getText();
		}
		
		for(String options:s)
		{
			System.out.println(options);
		}
	}
	
}
