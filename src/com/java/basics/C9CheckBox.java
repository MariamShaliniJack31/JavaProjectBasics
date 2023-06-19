package com.java.basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class C9CheckBox {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		driver.get("C:\\Users\\mrufu\\OneDrive\\Desktop\\Sample.html");
		
		WebElement scaleschkbox = driver.findElement(By.xpath("//input[@type='checkbox'][@id='scales']"));
		WebElement hornschkbox = driver.findElement(By.xpath("//input[@type='checkbox'][@id='horns']"));
		
		if ( scaleschkbox.isSelected())
		{
			System.out.println(scaleschkbox.isSelected());
			scaleschkbox.click();
			System.out.println(scaleschkbox.isSelected());
		}
		if (! hornschkbox.isSelected())
		{
			System.out.println(hornschkbox.isSelected());
			hornschkbox.click();
			System.out.println(hornschkbox.isSelected());
		}
//		driver.findElement(By.id("fname")).sendKeys("Shalini");
//		Thread.sleep(3000);
//		driver.findElement(By.id("fname")).clear();
		//driver.quit();
	}
}
