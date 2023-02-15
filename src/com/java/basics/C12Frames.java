package com.java.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class C12Frames {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		driver.get("https://demoqa.com/frames");
		
		List <WebElement> noofframes = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + noofframes.size());
		
		//Switch by Index
		driver.switchTo().frame(0);
		
		//Switch by frame id or name
		driver.switchTo().frame("frame1"); // here frame1 is ID // Couldn't find name attribute
		System.out.println( driver.getTitle() );
		
		//First find the element using any of locator stratedgy and switch to frame using WebElement on the that frame
		WebElement iframeElement = driver.findElement(By.id("sampleHeading"));
		driver.switchTo().frame(iframeElement);
		
		//Switch back to the main window
		driver.switchTo().defaultContent();
	}
}
