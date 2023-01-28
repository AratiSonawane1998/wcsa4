package SelectClass;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.FutureLinkedList;

//how to elemenate dupliate from dropdown by using treeset
public class GetOptions4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/hp/Desktop/WCSA4/Multi.html");
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);
		List<WebElement> allOptions = sel.getOptions();
		//using Treeset
        TreeSet<String> s=new TreeSet<String>();
       	LinkedList<String> s1 = new LinkedList<String>();
		for(int i=0; i<allOptions.size();i++)
		{
			WebElement opts= allOptions.get(i);
			String values = opts.getText();
		}
		for(String options:s)
		{ 
			System.out.println(options );
		}
	
}
}