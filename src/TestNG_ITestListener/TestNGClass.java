package TestNG_ITestListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

@Listeners(ListenersTestNG.class)
public class TestNGClass {

	WebDriver driver;
	
	@Test(priority=3)  //Success Test
	public void CloseBrowser() {
		driver.quit();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test(priority=0) //Failed Test
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com");
	    String expectedTitle = "Free QA Automation Tools For Everyone";
	    String originalTitle = driver.getTitle();
	    driver.manage().window().maximize();
	    Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
	}
	
	private int i = 1;
	@Test (priority=2, successPercentage = 60, invocationCount = 5) //Failing Within Success
	public void AccountTest() {
		if(i < 2)
			Assert.assertEquals(i , i);
			i++;
	}
	
	@Test (priority=1) // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
}