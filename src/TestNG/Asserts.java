package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Asserts {
	
	WebDriver driver;
	
	@Test (priority = 0)
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	    Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        
	    driver.get("https://www.toolsqa.com/");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    Reporter.log("The website used was DemoQA for this test", true);
	    String expectedTitle = "Free QA Automation Tools For Everyone";
	    String originalTitle = driver.getTitle();
	    System.out.println(originalTitle);
	    ///These are Hard Assets..it stops test execution when Assert fails
	    //Assert.assertEquals(originalTitle, expectedTitle);
	    Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
	}
	
	@Test (priority = 1)
	public void LastMethod() {
		System.out.println("I am in LastMethod");
		Reporter.log("I am in LastMethod");
	}
}