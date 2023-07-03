package FrameworkUI_YourStore.FrameworkUI_YourStore;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.Tablets;

public class TabletPageTest extends TestBase {

	HomePage homePage;
	Tablets tablets;

	public TabletPageTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {

		initalization();
		homePage = new HomePage();
		tablets = new Tablets();
	}

	@Test(priority = 1)
	public void validatetitleOfTabletPage() {
		String page = tablets.clickonTabletPage();
		Assert.assertEquals(page, page);
		System.out.println(page);

		
	}
	@Test(priority = 2)
	public void  validateValues() {
		List<String>  listofvalues = tablets.sortByValues();
		Assert.assertEquals(listofvalues,listofvalues  );
	 
		
		System.out.println(listofvalues);
		
	}
	
	@Test(priority = 3)
	public void validatePrice() {
		List<String> price= tablets.showPrice();
		Assert.assertEquals(price, price);
		
		System.out.println(price);
	}
	

@Test(priority = 4)
public void clickonCart() {
	       tablets.addtoCart();
	    
	   
	   }


}


