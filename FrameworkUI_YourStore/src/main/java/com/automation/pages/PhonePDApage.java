package com.automation.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.TestBase;

public class PhonePDApage extends TestBase {

	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	public WebElement phonepda;
	@FindBy(xpath = "//select[@id='input-sort']")
	public WebElement Sort;
	@FindBy(xpath = "//button[@onclick=\"cart.add('28', '1');\"]")
	public WebElement addtocart;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']//a[text()='HTC Touch HD']")
	public WebElement message;

	public PhonePDApage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public String checkTitle() {
		phonepda.click();
		String str = driver.getTitle();
		System.out.println(str);

		return str;

	}

	public List<String> sortByValues() {
		List<String> arrayListSort = new ArrayList<String>();
		String sortByValues = "";

		for (int i = 1; i <= 9; i++) {
			Sort.click();
			WebElement ele = driver.findElement(By.xpath("//select[@id='input-sort']/option[" + i + "]"));
			sortByValues = ele.getText();
			if (sortByValues.equals("Model (A - Z)")) {
				System.out.println(ele.getText());
				ele.click();

				break;

			}

		}
		return arrayListSort;
	}

	public List<String> showPrice() {
		List<String> arrayList = new ArrayList<String>();
		String showPrice = "";

		for (int i = 1; i <= 5; i++) {
			WebElement element = driver.findElement(By.xpath("//select[@id='input-limit']/option[" + i + "]"));
			showPrice = element.getText();

			if (showPrice.equals(100)) {
				element.click();
				System.out.println(element.getText());
			}

		}
		return arrayList;
	}

	public String validateMessage() throws InterruptedException {
		addtocart.click();
		Thread.sleep(500);
	boolean flag=	message.isDisplayed();
	System.out.println(flag);
		String str = message.getText();
		return str;

	}
}