package com.java.basics;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C7WaitCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		//PageLoad
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String sTitle = driver.getTitle();
		System.out.println("The title of the Page is : " + sTitle);
		
		////Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));
		
		Select drpcountry = new Select(country);
		drpcountry.selectByIndex(1);
		System.out.println("The Country selected is : " + drpcountry.getFirstSelectedOption().getText());
		
		drpcountry.selectByIndex(10);
		System.out.println("The Country selected is : " + drpcountry.getFirstSelectedOption().getText());
		
		
		///////////////Fluent Wait
		@SuppressWarnings("deprecation")
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
			       				.withTimeout(30, TimeUnit.SECONDS)
			       				.pollingEvery(5, TimeUnit.SECONDS)
			       				.ignoring(NoSuchElementException.class);

		WebElement foo = fwait.until(new Function<WebDriver,WebElement> () {
			public WebElement apply(WebDriver driver) {
				//WebElement fcountry = driver.findElement(By.name("country"));
				if (country.isEnabled()) {
					System.out.println("Element is Found");
				}
				return country;
			}
		});
		driver.quit();
	}
}
