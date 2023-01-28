package KeyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt= new BaseTest();
		bt.openBrowser();
	    
	    Flib flib = new Flib();
	   
	    
	    String username = flib.readPropertyData(PROP_PATH,"Username");
	    String password = flib.readPropertyData(PROP_PATH,"Password");
	    
	    
	    driver.findElement(By.name("username")).sendKeys(username);
	    Thread.sleep(2000);
	    driver.findElement(By.name("pwd")).sendKeys(password);
	    
	    
	    driver.findElement(By.id("loginButton")).click();
	    bt.closeBrowser();
}
	
}