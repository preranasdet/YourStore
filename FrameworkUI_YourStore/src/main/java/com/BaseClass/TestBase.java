package com.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	
	public static WebDriver driver;
    public static  Properties prop;
	
//we add properties file code in TestBase() constructor because we need data of config.properties file 
 //	into before our test cases start
	public TestBase() throws IOException{
		
		try {
			prop=new Properties();
			FileInputStream ip= new FileInputStream("D:\\JavaAutomation\\FrameworkUI_YourStore\\src"
					+ "\\main\\java\\com\\automation\\confiq\\confiq.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	    public  static void initalization() {
	  String browsername	= prop.getProperty("browser");
	  if(browsername.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
	  }else 
	  {
		// if(browsername.equals("Firefox"));
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\rupes\\Downloads\\geckodriver_win32\\geckodriver.exe" );
		// driver = new FirefoxDriver();
	  }
	 driver.get(prop.getProperty("url"));   	
	driver.manage().window().maximize();
		
	}
	   
}
