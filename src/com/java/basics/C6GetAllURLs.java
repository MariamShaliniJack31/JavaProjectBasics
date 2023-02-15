package com.java.basics;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator; 
import java.util.List;

public class C6GetAllURLs {

	public static void main(String[] args) {

		//Create WebDriver instance and open the website.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
      
		String url="";
		List<WebElement> allURLs = driver.findElements(By.tagName("a"));
		for(int i = 0; i < allURLs.size() ; i++)
			System.out.println( allURLs.get(i).getText() );
		System.out.println("Total links on the Web Page : " + allURLs.size());

		//We will iterate through the list and will check the elements in the list.
		Iterator<WebElement> iterator = allURLs.iterator();
		while (iterator.hasNext()) {
			url = iterator.next().getText();
			System.out.println(url);
		}
      
		//Close the browser session
		driver.quit();
	}
}