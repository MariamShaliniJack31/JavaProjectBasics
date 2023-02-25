package POM.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
	private static WebElement element = null;

	public static String getTitle(WebDriver driver){
		String Title = driver.getTitle();
		return Title;
	}
}
