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
import pageObjects.CheckOutPage;
import pageObjects.LandingPage;
import utils.TextContextSetup;

public class CheckOutPage_StepDefinition {
	
	
	public TextContextSetup textContextSetup;
	public CheckOutPage checkOutPage;
	
	public CheckOutPage_StepDefinition(TextContextSetup textContextSetup) {
		
		this.textContextSetup = textContextSetup;
		this.checkOutPage = textContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	
	@And("verify user able to apply promocode and place order")
	public void verify_user_able_to_apply_promocode_and_place_order(){
			
		Assert.assertTrue(checkOutPage.VerifyPromoBtn());
		Assert.assertTrue(checkOutPage.VerifyPlaceOrder());
			
	}
	
	@Then("^user proceed to checkout and validate the (.+) items in checkout page$")
	public void user_proceed_checkout_and_validate_items_checkoutPage() {
		
		checkOutPage.CheckOut();
		
		
	}
	
	



}
