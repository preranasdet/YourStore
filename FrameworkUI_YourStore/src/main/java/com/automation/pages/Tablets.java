package com.automation.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.TestBase;

public class Tablets extends TestBase {

	@FindBy(xpath = "//a[@href='https://naveenautomationlabs.com/opencart/"
			+ "index.php?route=product/category&path=57']")
	public WebElement tabletPage;

	@FindBy(xpath = "//a[text()='Desktops (13)']")
	public WebElement DesktopTab;

	@FindBy(xpath = "//select[@id='input-sort']")
	public WebElement Sort;

	@FindBy(xpath = "//option[text()='Price (Low > High)']")
	public WebElement Price;

	@FindBy(xpath = "//select[@id='input-limit']")
	public WebElement show;

	@FindBy(xpath = "//option[text()='50']")
	public WebElement value;

	@FindBy(xpath = "//button[@onclick=\"cart.add('49', '1');\"]")
	public WebElement mobilephone;
	
	@FindBy(xpath= "//div[@class='alert alert-success alert-dismissible']")
	public WebElement msg;

	public Tablets() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}

	public String clickonTabletPage() {
		tabletPage.click();
		String str = driver.getTitle();
		System.out.println(str);
		return str;
	}

	public List<String> sortByValues() {
		List<String> arrayListSort = new ArrayList<String>();
		String sortByValues = "";
		Sort.click();

		for (int i = 1; i <= 9; i++) {
			WebElement ele = driver.findElement(By.xpath("//select[@id='input-sort']/option[" + i + "]"));
			sortByValues = ele.getText();
			if (sortByValues.equals("Price (High > Low")) {
				ele.click();

				System.out.println(ele.getText());
			}

		}
		return arrayListSort;
	}
	public List<String> showPrice() {
		List<String> arrayList = new ArrayList<String>();
		String showPrice ="";
		show.click();
		value.click();
		for (int i = 1; i <= 5; i++) {
			WebElement element = driver.findElement(By.xpath("//select[@id='input-limit']/option[" + i + "]"));
			showPrice = element.getText();
		
			if (showPrice.equals(50)) {
				element.click();
				System.out.println(element.getText());
			}

		}
		return arrayList;
	}

	public void addtoCart() {
	
		mobilephone.click();
		
	}
	

		public boolean validatemsg()  {
			msg.getText();
			System.out.println(msg);
			return msg.isDisplayed();
		}

}
	
	
	
	
	
	
	
	
	
	
	
	
	