package com.AccessModifiers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {
	
	public static void main(String args[]) { 
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
	
		WebElement frmelement = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement toelement = driver.findElement(By.xpath("//input[@id='toCity']"));			
		WebElement searchButton = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
		frmelement.click();
		frmelement.sendKeys("Mumbai");
		toelement.sendKeys("New Delhi");
		searchButton.click();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement priceList = driver.findElement(By.xpath("//div[@class='blackText fontSize18 blackFont white-space-no-wrap']"));
		System.out.println(priceList.getSize());
		
		
		
		
		
	}
}
