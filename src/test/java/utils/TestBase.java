package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManger() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_prop = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		
		String browser = browser_maven!=null ? browser_maven : browser_prop;
		//result = testcondition ? value1 : value2
		
		if(driver == null) {
			
			if(browser.equalsIgnoreCase("chrome")) {
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
			}
			
			if(browser.equalsIgnoreCase("firefox")) {
				
				driver = new FirefoxDriver();
				driver.get(url);
				driver.manage().window().maximize();
					
				
			}
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		}
		return driver;
	}

}
