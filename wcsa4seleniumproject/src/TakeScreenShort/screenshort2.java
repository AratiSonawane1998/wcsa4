package TakeScreenShort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class screenshort2 {
	public static void main(String[] args) throws IOException   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		RemoteWebDriver rwd = (RemoteWebDriver) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshort/screenshort2.jpg");
		Files.copy(src,dest);
}
}