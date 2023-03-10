package TakeScreenShort;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.print.attribute.standard.Destination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrrenShort1 {
//directly creating object of browser specific (c)
	public static void main(String[] args) throws IOException   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshort/screenshort1.jpg");
		Files.copy(src,dest);
	}
}
