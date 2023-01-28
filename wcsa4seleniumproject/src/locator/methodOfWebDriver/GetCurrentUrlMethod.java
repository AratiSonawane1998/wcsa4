package methodOfWebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("WebDrievr.chrome.driver","./Drivers/chromrdriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		String CurrentUrl = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(CurrentUrl);
		
		
			
	}

}
