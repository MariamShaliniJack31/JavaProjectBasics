package com.java.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C7SelectDropDown {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().to(URL arg0);
	
//		WebElement country = driver.findElement(By.name("country"));
//		Select drpCountry = new Select(country);
		
		//Using Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));
		Select drpCountry = new Select(country);
		
		//Using selectByIndex
		System.out.println("Using selectByIndex");
		drpCountry.selectByIndex(2);
		Thread.sleep(5000);
		String seleceted = drpCountry.getFirstSelectedOption().getText();
		System.out.println(seleceted);
				
		System.out.println("Using selectByValue");
		drpCountry.selectByValue("INDIA");
		Thread.sleep(5000);
		System.out.println(seleceted);
		
		System.out.println("Using selectByVisibleText");
		drpCountry.selectByVisibleText("KOREA, REPUBLIC OF");
		Thread.sleep(5000);
		System.out.println(seleceted);
		
		List<WebElement> dd = drpCountry.getOptions();
	    //Get the length
	    System.out.println("The size of the List is : " +dd.size());
	    
	    // Loop to print one by one or ListOption exists or not
	    for (int j = 0; j < dd.size(); j++) {
	        //System.out.println(dd.get(j).getText());
	        if(dd.get(j).getText().contentEquals("INDIA"))
	    		System.out.println("INDIA exists");

	    }
	    for(int j = 0; j <= dd.size()-1; j++)
	    {
	    	//System.out.println(dd.get(j).getText());
	    	if(dd.get(j).getText().contentEquals("INFIA"))
	    		System.out.println("INFIA exists");
	    }
	}
}

//	//input[@name='firstName']
//	//b[text()='Email:']