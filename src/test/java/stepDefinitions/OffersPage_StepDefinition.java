package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.GenericUtils;
import utils.TextContextSetup;

public class OffersPage_StepDefinition {
	
	public TextContextSetup textContextSetup;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	
	//single responsibility Principle
	//Loosly coupled
	//Factory design pattern
	
	
public OffersPage_StepDefinition(TextContextSetup textContextSetup) throws InterruptedException {
		
		this.textContextSetup = textContextSetup;
		Thread.sleep(2000);
	}


	

	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException { 
		
		
		
		switch_to_Offers_Page();
		
		OffersPage offersPage = textContextSetup.pageObjectManager.getOffersPage();
		offersPage.searchItem(shortName);
	   // textContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);

		//offersPage.getProductName();
	    //System.out.println(textContextSetup.offersproductpage +" is extracted from Home Page ");
	    
	}
	
	public void switch_to_Offers_Page() {
		//--> if switched to offer page -> Skip below part
		//if(textContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
		
		//pageObjectManager = new PageObjectManager(textContextSetup.driver);
		LandingPage landingPage = textContextSetup.pageObjectManager.getLandingPage();
		
		
		//LandingPage landingPage = new LandingPage(textContextSetup.driver);
		landingPage.selectTopDealsPage();
		textContextSetup.genericUtils.Switch_Window_to_Child();
		
	    
	}
	

   @And("validate product name in offers page matches with landing page")
   public void validate_product_name_in_offers_page_matches_with_landing_page() {
	   
	   Assert.assertEquals(textContextSetup.offersproductpage,textContextSetup.landingproductName);
    
}


}
