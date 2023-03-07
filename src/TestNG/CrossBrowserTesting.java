package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CrossBrowserTesting {

	public WebDriver driver;
	
	@Parameters({"browser", "Name"})
	@BeforeClass
	// Passing Browser parameter from TestNG xml
	public void beforeTest(String bro, String nam) {
		
		// If the browser is Firefox, then do this
		if(bro.equalsIgnoreCase("edge")) {
			//Initializing the Edge driver
			System.setProperty("webdriver.edge.driver","C:\\Users\\mrufu\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("I am in Edge Ms. "+nam);
		} else if (bro.equalsIgnoreCase("chrome")) { 
			//Initialize the chrome driver
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("I am in Chrome Mr. "+nam);
		} 
		// Enter the website address in the browser
		driver.get("https://www.toolsqa.com"); 
	}

	// Once Before method is completed, Test method will start
	@Test
	public void login() throws InterruptedException {
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		System.out.println(driver.getTitle());
	}  

	@AfterClass
	public void afterTest() {
		driver.quit();
	}
}