package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By search = By.xpath("//input[@type='search']");
	By productName = By.xpath("//h4[text()='Tomato - 1 Kg']");
	By topDeals = By.xpath("//a[@href='#/offers']");
	By increment = By.xpath("//div/a[@class='increment']");
	By addCart = By.xpath("//div/button[@type='button']");
	
	public void searchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
	}
	
	
    public void getSearchText() {
		
		driver.findElement(search).getText();
	}
    
    public void incrementQuality(int quality) {
    	
    	int i = quality-1;
    	while(i>0) {
    		driver.findElement(increment).click();
    		i--;
    	}
    }
    
    public void addToCart() {
    	driver.findElement(addCart).click();
    }

	public String getProductName() {
		// TODO Auto-generated method stub
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage() {
		
		driver.findElement(topDeals).click();
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
	}
	
	 public void Hello3() {
		   
		   System.out.println("hello selva");
		   System.out.println("hello selva");
		   System.out.println("hello selva");
		   System.out.println("hello selva");
	}
	
	 
	 public void Hello4() {
		   
		   System.out.println("hello selva");
		   System.out.println("hello selva");
		   System.out.println("hello selva");
		   System.out.println("hello selva");
	}
	

}
