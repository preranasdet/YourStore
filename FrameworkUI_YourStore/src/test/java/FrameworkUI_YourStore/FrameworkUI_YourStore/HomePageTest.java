
package FrameworkUI_YourStore.FrameworkUI_YourStore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BaseClass.TestBase;
import com.automation.pages.HomePage;
import com.automation.util.utiltest;

public class HomePageTest extends TestBase {

	HomePage homePage;
	utiltest util;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {

		initalization();// opening browser
		homePage = new HomePage();// initialization of HomePage
		util = new utiltest();
	}

	@Test(priority = 1)
	public void validateElementsVisibility() throws IOException {

		boolean contactNumberValue = homePage.checkVisiblityContactNumber();
		// Assert.assertEquals(contactNumberValue, true);
		// Assert.assertTrue(contactNumberValue);
		Assert.assertEquals(contactNumberValue, true, "Contact number is not visible/displayed on homepage");
		boolean Wishlistl = homePage.checkVisiblityWishlist();
		Assert.assertEquals(Wishlistl, true, "Wishlist not Displayed");
		boolean Shoppingcartk = homePage.checkVisiblityShoppingcart();
		Assert.assertEquals(Shoppingcartk, true, "shoppingcart is not displayed");
		boolean Chekoutc = homePage.checkVisiblityCheckout();
		Assert.assertEquals(Chekoutc, true, "Checoutc is not displayed");
	}

	@Test(priority = 2)
	public void validateCurrancyNames() throws IOException {

		List<String> currencyList = homePage.getCurrencyValues();
		System.out.print(currencyList);
		
	}
	
	/*@DataProvider(name = "exceldataprovider")
	public Object[][] takeDataFromexcel() throws IOException 
	{
	   Object  data[][]  =	util.getData("Sheet1");
	   
	    return data;	
	}
	*/
	
      @Test()
       public void validateHeaderLinkText() throws IOException {
    	  
    	  String str1;
    	  String str2;
    	  	  
	               List<String> titleList=homePage.getHeaderLinkText();
	                 ArrayList<Object> al    = util.getData("Sheet1");
	               titleList.equals(al);
	               
	               System.out.println("title size is :" +titleList.size());
	               
	               for(int i=0;i<titleList.size();i++) 
	               {	            	 
	            	   str1 = titleList.get(i);
	            	  str2 = (String) al.get(i);
	            	  Assert.assertEquals(str1, str2);
	               }
	               
}

         
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
