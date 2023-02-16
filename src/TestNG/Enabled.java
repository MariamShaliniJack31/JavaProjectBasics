package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
	
	@Test(priority = 1)
	public void CloseBrowser() {
		System.out.println("Closing Google Chrome browser");
	}

	@Test(priority = 0)
	public void OpenBrowser() {
		System.out.println("Launching Google Chrome browser"); 	
		}

	@Test(priority=0, enabled = false)
	public void AccountTest(){
		System.out.println("Some tests for Customer Account");
	}
}