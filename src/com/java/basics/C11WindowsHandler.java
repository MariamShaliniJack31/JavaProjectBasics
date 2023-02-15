package com.java.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C11WindowsHandler {

	public static void main(String[] args) throws InterruptedException {
	
		// open new chrome window
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// specify page load
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// specify Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// maximize window
		driver.manage().window().maximize();

		// Window Handler
		driver.get("https://demoqa.com/browser-windows");

		// click on New Tab Button
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		// specify Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		String mWndHandle = driver.getWindowHandle();
			
		Set<String> strWndHandles = driver.getWindowHandles(); 
		for(String wndHandle : strWndHandles) { 
			System.out.println(wndHandle);
			driver.switchTo().window(wndHandle);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Sample")){
				System.out.println(driver.getTitle());
				break; 
			} 
		}
		 
		driver.switchTo().window(mWndHandle);
		System.out.println(driver.getTitle());
		
		// Open new child window within the main window
        driver.findElement(By.id("windowButton")).click();

        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
        	String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
            	driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
            }
        }
				 
		driver.switchTo().window(mWndHandle);
		System.out.println(driver.getTitle());
		driver.close(); // closes only current window
		driver.quit(); // closes all windows opened in current session
	}
}
