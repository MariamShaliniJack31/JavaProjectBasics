package POM.com.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Import POM Pages
import POM.com.pages.Home_Page;
import POM.com.pages.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1_PageObjectModel {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mrufu\\Downloads\\chromedriver_win32_110\\chromedriver.exe");
		//WebDriverManager.chromedriver().browserVersion("110.0").setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//// Use page Object library now
		Login_Page.txtbx_UserName(driver).sendKeys("mariamshalini@gmail.com");
		Login_Page.txtbx_Password(driver).sendKeys("Shalini31*");
		Login_Page.btn_LogIn(driver).click();
		
		System.out.println("Login Successfully, now it is the time to Log Off buddy.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String title = Home_Page.getTitle(driver); 
		
		System.out.println("The title of the Page is : " +title);
		driver.quit();
	}
}