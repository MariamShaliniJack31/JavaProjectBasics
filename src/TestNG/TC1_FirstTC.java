package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

/// Associated TestNG Library 7.4.0 & JQuery 3.5.1 along with JRE & Selenium Jars
public class TC1_FirstTC {

	WebDriver driver ;
	
	@Test
	public void f() {
		String baseUrl = "https://www.toolsqa.com/";
		System.out.println("Launching Google Chrome browser"); 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(baseUrl);
	    String testTitle = "Free QA Automation Tools For Everyone";
	    String originalTitle = driver.getTitle();
	    Assert.assertNotEquals(originalTitle, testTitle);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod : Starting Test On Chrome Browser");
		Reporter.log("BeforeMethod : Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("AfterMethod : Finished Test On Chrome Browser");
		Reporter.log("AfterMethod : Finished Test On Chrome Browser");
	}
}