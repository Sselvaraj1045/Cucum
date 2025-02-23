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
import utils.TextContextSetup;

public class LandingPage_StepDefinition {
	
	
	public TextContextSetup textContextSetup;
	public LandingPage landingPage;
	
	public LandingPage_StepDefinition(TextContextSetup textContextSetup) {
		
		this.textContextSetup = textContextSetup;
		this.landingPage = textContextSetup.pageObjectManager.getLandingPage();
	}
	
	
	@Given("is on GreenCart Landing page")
	public void is_on_green_cart_landing_page() {
		
		Assert.assertTrue(landingPage.getPageTitle().contains("GreenKart"));
	    
		
	}

	@When("^user searched with short name called (.+) and extracted actual name of product$")
	public void user_searched_with_short_name_called_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		
		
		
		
		Thread.sleep(2000);
		landingPage.getProductName().split("-")[0].trim();
		landingPage.searchItem(shortName);
		System.out.println(landingPage +" is extracted from Home Page ");
	   
	}
	@And("^added (.+) items to checkout page$")
	public void add_items_checkoutpage(String quality) {
		
		landingPage.incrementQuality(Integer.parseInt(quality));
		landingPage.addToCart();
		
	}
	
	



}
