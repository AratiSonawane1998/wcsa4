package Mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class TakeScrrenShoot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshrot/screenshort6");
		Files.copy(src, dest);
	} 
	
}
