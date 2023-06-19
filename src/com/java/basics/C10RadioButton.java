package com.java.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class C10RadioButton {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().arch64().setup();;
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		driver.get("C:\\Users\\mrufu\\OneDrive\\Desktop\\Sample.html");
		String x = driver.getWindowHandle();
		System.out.println(x);

		//findElements return list of WebElements having that locator in that parent
		List<WebElement> rdbuttons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("The No of RadioButtons are : " + rdbuttons.size());
		for(int i = 0; i < rdbuttons.size(); i++) {
				//System.out.println(rdbuttons.get(i).getAttribute("index"));
			if (! rdbuttons.get(i).isSelected())
			{
				System.out.println(rdbuttons.get(i).isSelected());
				rdbuttons.get(i).click();
				System.out.println(rdbuttons.get(i).isSelected());
			}
		}
//		for (WebElement i : rdbuttons )
//			System.out.println(i);
	}
}