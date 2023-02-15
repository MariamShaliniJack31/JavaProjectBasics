package com.java.basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class C8ActionsClass_MouseOperations {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		driver.get("http://google.com");
	
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
				
//		//To Scroll Down 
//		//WebElement jbc = driver.findElement(By.xpath("//div[@class='wgtCont']/h4[text()='Jobs by Category']"));
//		WebElement sponcomp = driver.findElement(By.xpath("//div//h2[text()='Sponsored companies']"));
//		act.moveToElement(sponcomp).build().perform();
//		Thread.sleep(1000);
//		
//		//MouseHover on Recruiters
//		//WebElement recruiters = driver.findElement(By.xpath("//div[text()='Recruiters']"));
//		WebElement services = driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"));
//		act.moveToElement(services).build().perform();
//		Thread.sleep(1000);
//		
//		//Click
//		WebElement bac = driver.findElement(By.xpath("//a[@title='Explore top companies hiring on Naukri']"));
//		act.click(bac).build().perform();
//		Thread.sleep(1000);
//		
//		/*Actions builder = new Actions(driver);
//		Action dd = builder.clickAndHold(bac)
//				.clickAndHold()
//				.build()
//				.perform();*/
		
//		act.keyDown(Keys.F5);
//		act.keyUp(Keys.F5);

		//driver.findElement(By.linkText("uu")).click();
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elm = driver.findElement(By.xpath("//a[text()='Sign in']"));
		act.moveToElement(elm).build().perform();
		
		WebElement title = driver.findElement(By.xpath("//div[@class='tabset__tabs__content__title']"));
		act.moveToElement(title).build().perform();
		
		////////////////Not Working
		act.keyDown(Keys.F5);
		act.keyUp(Keys.F5);
	}
}