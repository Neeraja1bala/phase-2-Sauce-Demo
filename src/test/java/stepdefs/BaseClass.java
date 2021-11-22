package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	
	public static WebDriver driver;
	
	@Before
	public void SetUp() {
		
		System.setProperty("webdriver.chrom.driver","chromedrive");
		driver = new ChromeDriver();
	}
	
	
	@After
	public void TearDown() {
		
		driver.quit();
		
	}

}
