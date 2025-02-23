package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TextContextSetup;

public class Hooks {
	
	public TextContextSetup textContextSetup;
	
	
	public Hooks(TextContextSetup textContextSetup) {
		
		this.textContextSetup = textContextSetup;
		
	}
	
	
	@After
	public void AfterScenario() throws IOException {
		
		textContextSetup.testBase.WebDriverManger().quit();
			
	}
	
	@AfterStep
	
	public void AddScreeshot(Scenario scenario) throws IOException {
		WebDriver driver = textContextSetup.testBase.WebDriverManger();
		if(scenario.isFailed()) {
			//screenshot
			File srcPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(srcPath);
			scenario.attach(fileContent, "image/png", "image");
		}
		
	}

}
