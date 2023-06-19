package POM.com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM.com.TestBase.TestBase;
import POM.com.tests.TC2_1_POM;
import POM.com.tests.TC_1_POM;

public class Login_Page2 extends TestBase{

	//When running TC_1_POM, write the code as public class Login_Page2 extends TC1_1_POM{
	// E-Mail
	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;
	
	///Password
	@FindBy(xpath = "//input[@id='pass']")
	public WebElement password;
	
	///Login Button
	@FindBy(xpath = "//button[@name='login']")
	public WebElement loginbutton;
	
	public Login_Page2() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonElement(String webElementTitle){
	
		switch(webElementTitle.toUpperCase()) {
			case "LOGIN": {
				loginbutton.click();
				break;
			}
		}
	}

	public void sendkeys(String webElementTitle, String val){
		
		switch(webElementTitle.toUpperCase()) {
			case "EMAIL": {
				email.sendKeys(val);
				break;
			}
			case "PASSWORD": {
				password.sendKeys(val);
				break;
			}
		}
	}
}