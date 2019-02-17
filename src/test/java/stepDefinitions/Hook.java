package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hook {

	public static WebDriver driver;
	
	@Before
	public static void BrowserOpen(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void BrowserClose() {
		driver.quit();
		driver.close();
	}

}
