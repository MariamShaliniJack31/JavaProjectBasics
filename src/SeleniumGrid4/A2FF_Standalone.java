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

public class A2FF_Standalone {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver;
		String URL = "https://www.google.com";
 		String Node = "http://10.0.0.40:4444";
 		
 		FirefoxOptions options = new FirefoxOptions();
 		 		 		
 		DesiredCapabilities cap = new DesiredCapabilities();
 	    cap.setPlatform(Platform.WINDOWS);
 	    cap.setBrowserName("firefox");
 	    cap.setVersion("111.0");
 	    
 	    ////Below both the commands are working
 	    //cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
 	    cap.setCapability("goog:FirefoxOptions", options);
 		
 	    System.out.println("Before RemoteWebDriver");
 		driver = new RemoteWebDriver(new URL(Node), cap);

 		driver.get(URL);
 		System.out.println(driver.getTitle());
 		Thread.sleep(5000);
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