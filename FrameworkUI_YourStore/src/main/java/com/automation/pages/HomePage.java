package com.automation.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//ul[@class='list-inline']//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/contact']")
	public WebElement contactIcon;

	@FindBy(xpath = "//span[text()='123456789']")
	public WebElement contactNumber;

	@FindBy(xpath = "//span[text()='My Account']")
	public WebElement myaccount;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[@href="
			+ "'https://naveenautomationlabs.com/opencart/index.php?route=account/register']")
	public WebElement register;

	@FindBy(xpath = "//ul[@class=dropdown-menu dropdown-menu-right']//a[@href='https://"
			+ "naveenautomationlabs.com/opencart/index.php?route=account/login']")
	public WebElement login;

	@FindBy(xpath = "//span[text()='Wish List (0)']")
	public WebElement wishlist;

	@FindBy(xpath = "//span[text()='Shopping Cart']")
	public WebElement shoppingcart;

	@FindBy(xpath = "//span[text()='Checkout']")
	public WebElement checkout;

	@FindBy(xpath = "//img[@src='https://naveenautomationlabs.com/opencart/image/catalog/opencart-logo.png']")
	public WebElement logo;

	@FindBy(xpath = "//input[@class='form-control input-lg']")
	public WebElement searchbox;

	@FindBy(xpath = "//i[@class='fa fa-search']")
	public WebElement searchbutton;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	public WebElement items;

	@FindBy(xpath = "//button//span[text()='Currency']")
	public WebElement currency;

	@FindBy(xpath = "//ul[@class='dropdown-menu']//li[1]")
	public WebElement currencyName;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]")
	public WebElement header;

	//// ul[@class='dropdown-menu']//li

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}

	public void clickonContactNumber() {
		contactIcon.click();
	}

	public List<String> getCurrencyValues() {
		List<String> arrayListCurrency = new ArrayList<String>();
		String currencyName = "";
		currency.click();

		for (int i = 1; i <= 3; i++) {
			WebElement ele = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[" + i + "]//button"));
			currencyName = ele.getText();
			System.out.println(currencyName);
			arrayListCurrency.add(currencyName);

		}
		return arrayListCurrency;
	}

	public boolean checkVisiblityContactNumber() {

		System.out.println(contactNumber.getText());
		return contactNumber.isDisplayed();
	}

	public boolean checkVisiblityWishlist() {
		return wishlist.isDisplayed();
	}

	public boolean checkVisiblityShoppingcart() {
		return shoppingcart.isDisplayed();
	}

	public boolean checkVisiblityCheckout() {
		return checkout.isDisplayed();

	}

	public Login TabletPage() throws IOException{
		login.click();
		return new Login();
		
		
	   }

public  List<String> getHeaderLinkText() {
    	   List<String> arrayList = new ArrayList<String>();
    	
   		String addtext = "";
          for (int i = 1; i <= 8; i++) {
   			WebElement element = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li["+ i + "]"));
   			addtext = element.getText();
   			System.out.println(addtext);
   			arrayList.add(addtext);
}
          return arrayList;
}

List<String> arrayList  = new ArrayList<String>();

  public List<String> getHeaderText(String headerValues)  
  {
	  arrayList.add(headerValues);
	  
	  System.out.println(arrayList);
	return arrayList;
  }
  
  

  
  
  
  
  
  
  
  
  
  
  
 
}