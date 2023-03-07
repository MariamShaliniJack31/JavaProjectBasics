package com.java.basics;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C16TakesScreenshot {

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
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		File destFile = null;
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String filePath = System.getProperty("user.dir") + "/screenshots/" + "_" + formater.format(calendar.getTime()) + ".png";
			System.out.println(filePath);
			destFile = new File(filePath);
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception t) {
			//ErrorUtil.addVerificationFailure(t);
			//LogFile.APPLICATION_LOGS.error("Error in taking screenshot" + t.getMessage());
			System.out.println("Error in taking screenshot" + t.getMessage());
		}
		driver.quit();
	}
}