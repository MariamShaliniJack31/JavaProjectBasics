package SeleniumGrid4;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;

public class A1Chrome_Standalone {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver;
		String URL = "https://www.google.com";
 		String Node = "http://10.0.0.40:4444";
 		
 		ChromeOptions options = new ChromeOptions();
 		options.addArguments("--disable-extensions");
 		options.addArguments("--disable-popup-blocking");
 		options.addArguments("--disable-infobars");
 		options.addArguments("--disable-notifications");
 		options.addArguments("start-maximized");
 		options.addArguments("--window-size=1920,1080");
 		
 		////This Line is not working
 		//options.setCapability("browserVersion", "111.0");
 		
 		DesiredCapabilities cap = new DesiredCapabilities();
 	    cap.setPlatform(Platform.WINDOWS);
 	    cap.setBrowserName("chrome");
 	    cap.setVersion("111.0");
 	    ////Below both the commands are working
 	    cap.setCapability(ChromeOptions.CAPABILITY, options);
 	    //cap.setCapability("goog:chromeOptions", options);
 		
 	    System.out.println("Before RemoteWebDriver");
 		driver = new RemoteWebDriver(new URL(Node), cap);

 		driver.get(URL);
 		System.out.println(driver.getTitle());
 		Thread.sleep(1000);
 		driver.quit();
 		
 		
// 		/////////////Firefox Browser
// 		FirefoxOptions foptions = new FirefoxOptions();
// 		
// 		DesiredCapabilities dc = new DesiredCapabilities();
// 	    dc.setPlatform(Platform.WINDOWS);
// 	    dc.setBrowserName("firefox");
// 	    dc.setVersion("110.0");
// 	    
// 	    dc.setCapability("moz:firefoxOptions", foptions);
//		dc.setCapability("marionette", true);
//
//		driver = new RemoteWebDriver(new URL(Node), dc);
//		WebDriverManager.firefoxdriver().arch64().browserVersion("111.0").setup();
//
// 		driver.get(URL);
// 		System.out.println(driver.getTitle());
// 		Thread.sleep(5000);
// 		driver.quit();
	}
}