package FrameworkUI_YourStore.FrameworkUI_YourStore;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.MP3;
import com.automation.pages.Tablets;

public class MP3Test extends TestBase {
	HomePage homePage;
	Tablets tablets;
	MP3 mp3;
	public MP3Test() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {

		initalization();
		homePage = new HomePage();
		tablets = new Tablets();
		mp3 = new MP3();
	}
	@Test
	public void  verifyMP3PlayerTitleAndText() {
		  boolean flag  = mp3.checkMP3PlayerVisibility();
		  Assert.assertEquals(flag, true, " title not diplayed");
		  
		   String mp3Title=mp3.checkTitle();
		   Assert.assertEquals(mp3Title, prop.getProperty("MP3PlayerPaageTitle"), "Title Not Displayed");
		   System.out.println(mp3Title);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
