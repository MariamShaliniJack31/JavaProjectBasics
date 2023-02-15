package com.java.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C5WdRedBusGetAllSRVCNos {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		
		driver.get("http://www.apsrtconline.in/oprs-web/");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("HYDERABAD");
		driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("BENGALURU");
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click()		;
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}
}