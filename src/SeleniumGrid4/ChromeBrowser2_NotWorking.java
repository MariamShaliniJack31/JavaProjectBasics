package SeleniumGrid4;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ChromeBrowser2_NotWorking {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver;
		String URL = "https://www.google.com";
 		String Node = "http://10.0.0.40:4444";
 		
 		Map<String, Object> prefs = new HashMap<String, Object>();
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--dns-prefetch-disable");
		options.addArguments("--disable-extensions");
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");
		options.addArguments("--enable-precise-memory-info");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("disable-infobars");
		options.addArguments("--window-size=1920,1080");
		
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
					
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("profile.default_content_settings.cookies", 2);
		
		options.setExperimentalOption("prefs", prefs);
		
		String chromeProfile ="";
		String[] switches = { "user-data-dir=" + chromeProfile  };
		
		capabilities.setCapability("chrome.switches", "--disable-extensions");
		capabilities.setCapability("chrome.switches", switches);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setCapability(CapabilityType.SUPPORTS_FINDING_BY_CSS, true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability("cssSelectorsEnabled", true);
		System.out.println("Before WebDriver");
		WebDriverManager.chromedriver().arch64().setup();
 		
 		
 		//driver = new RemoteWebDriver(new URL(Node), options);
		driver = new ChromeDriver(options);
 	
 		driver.get(URL);
 		System.out.println(driver.getTitle());
 		Thread.sleep(5000);
 		driver.quit();
 	}
}