package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By cartBag = By.xpath("//a/img[@alt='Cart']");
	By checkOutBtn = By.xpath("//div/button[text()='PROCEED TO CHECKOUT']");
	By promoBtn = By.xpath("//input[@class='promoCode']");
	By placeOrder = By.xpath("//button[text()='Place Order']");
	
	
	
	public void CheckOut() {
		
		driver.findElement(cartBag).click();
		driver.findElement(checkOutBtn).click();
		
	}
	
	public boolean VerifyPromoBtn() {
		
		return driver.findElement(promoBtn).isDisplayed();
	}
	
   public boolean VerifyPlaceOrder() {
		
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	

}
