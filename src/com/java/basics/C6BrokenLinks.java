package com.java.basics;

import java.util.*;
import java.net.*;
import org.openqa.selenium.*;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class C6BrokenLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");

        //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are : "+ links.size());  
      
        //checking the links fetched.
        for(int i=0; i < links.size(); i++)
        {
        	WebElement E1 = links.get(i);
        	String url = E1.getAttribute("href");
        	System.out.println(E1.toString());
        	verifyLinks(url);
        }
        
        driver.quit();
	}
    
    
    public static void verifyLinks(String linkUrl)
    {
    	try
        {
    		URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode() >= 400)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+" is a broken link");
            }    
       
            //Fetching and Printing the response code obtained
            else {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " is a Valid Link");
            }
        } catch (Exception e) {
        	System.out.println("The Exception occured is : " + e.getMessage());
        }
    }
}