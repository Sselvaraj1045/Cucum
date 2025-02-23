package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	

	public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.xpath("//td[text()='Tomato']");
	
	public void searchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
	}
	
	
    public void getSearchText() {
		
		driver.findElement(search).getText();
	}

	public String getProductName() {
		// TODO Auto-generated method stub
		return driver.findElement(productName).getText();
	}
	

}
