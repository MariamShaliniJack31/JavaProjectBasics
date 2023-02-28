package POM.com.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.com.TestBase.TestBase;
//Import POM Pages
import POM.com.pages.Home_Page;
import POM.com.pages.Login_Page2;

public class TC_1_POM extends TestBase{

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mrufu\\Downloads\\chromedriver_win32_110\\chromedriver.exe");
		//ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Login_Page2 lp = new Login_Page2();
		lp.sendkeys("EMAIL", "mariamshalini@gmail.com");
		lp.sendkeys("PASSWORD", "Shalini31*");
		lp.clickonElement("LOGIN");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String title = Home_Page.getTitle(driver); 
		System.out.println("The title of the Page is : " +title);
		driver.quit();
	}
}