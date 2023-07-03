package FrameworkUI_YourStore.FrameworkUI_YourStore;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.MP3;
import com.automation.pages.PhonePDApage;
import com.automation.pages.Tablets;

public class PhonePDATest extends TestBase {

	HomePage homePage;
	Tablets tablets;
	MP3 mp3;
	PhonePDApage phone;

	public PhonePDATest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {

		initalization();
		homePage = new HomePage();
		tablets = new Tablets();
		mp3 = new MP3();
		phone = new PhonePDApage();
	}

	@Test
	public void verifyPhonePDATitleandText() throws InterruptedException {
		String s = phone.checkTitle();
		Assert.assertEquals(s, prop.getProperty("PhonePDATitle"), "title not displayed");

		phone.sortByValues();

		phone.showPrice();
	String str	  = phone.validateMessage();
		   Assert.assertEquals(str, prop.getProperty("Message"));       

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}