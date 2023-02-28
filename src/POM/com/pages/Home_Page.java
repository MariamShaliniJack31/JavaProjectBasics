package POM.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
	public static String getTitle(WebDriver driver){
		String Title = driver.getTitle();
		System.out.println(Title);
		return Title;
	}
}
