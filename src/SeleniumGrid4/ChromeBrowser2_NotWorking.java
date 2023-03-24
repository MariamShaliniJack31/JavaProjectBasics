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

public class ChromeBrowser2_NotWorking {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver;
		String URL = "https://www.google.com";
 		String Node = "http://10.0.0.40:4444";
 		
 		ChromeOptions options = new ChromeOptions();
 		
// 		options.addArguments("--disable-extensions");
// 		options.addArguments("--disable-popup-blocking");
// 		options.addArguments("--disable-infobars");
// 		options.addArguments("--disable-notifications");
// 		options.addArguments("start-maximized");
// 		options.addArguments("--window-size=1920,1080");
 		
 		options.setCapability("browserVersion", "111.0");
 		options.setCapability("platformName", "Windows");
 		// Showing a test name instead of the session id in the Grid UI
 		options.setCapability("se:name", "My simple test"); 
 		// Other type of metadata can be seen in the Grid UI by clicking on the session info or via GraphQL
 		options.setCapability("se:sampleMetadata", "Sample metadata value"); 
 		
 		driver = new RemoteWebDriver(new URL(Node), options);
 		System.out.println("Before RemoteWebDriver");
 		driver.get(URL);
 		System.out.println(driver.getTitle());
 		Thread.sleep(5000);
 		driver.quit();
 	}
}