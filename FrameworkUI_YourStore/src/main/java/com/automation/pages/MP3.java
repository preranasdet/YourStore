package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.TestBase;


public class MP3 extends TestBase {
	@FindBy(xpath="//a[text()='MP3 Players']")
	public WebElement Mp3player;
	
	
	@FindBy(xpath="//a[text()='Show All MP3 Players']")
	public WebElement allmp3players;
	
	public MP3() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public boolean checkMP3PlayerVisibility() {
		return Mp3player.isDisplayed();
	
		}
	public String checkTitle() {
		
		Mp3player.click();
		 allmp3players.click();
		String str = driver.getTitle();
		System.out.println(str);
		return str;
	}
	
	
}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

