package com.java.basics;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class C1Wd_Chrome {

	public static void main(String[] args) {
				
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrufu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().version("83.0").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		
		//driver.get("http://mariamshalini@gmail.com:NCarolina31*@google.com");
		driver.get("http://www.javatpoint.com");
		String title = driver.getTitle();
		System.out.println("Title is : " +title);
		driver.manage().window().maximize();
		
		List<WebElement> f = driver.findElements(By.tagName("frame"));
		System.out.println("Total number of frames is " + f.size());
		
		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();
		
		while (I1.hasNext())
		{
			String child_window=I1.next();
			System.out.println("Child Window Name : " + child_window);
			System.out.println(driver.switchTo().window(child_window).getTitle());
			if(!parent.equals(child_window))
			{
				System.out.println("I am in IF");
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
//		if (driver.findElement(By.xpath("//div[contains(@aria-label,'Sign in to Google')]")).isDisplayed())  {
//			driver.findElement(By.xpath("//div[contains(@aria-label,'Sign in to Google')]")).click();	
//		}
//		
//		if (driver.findElement(By.xpath("//button[contains(@aria-label,'No thanks')]")).isDisplayed())  {
//			driver.findElement(By.xpath("//button[contains(@aria-label,'No thanks')]")).click();
//		}

		By lnk_java = By.xpath("//a[contains(text(),'Java')][contains(@href,'java-tutorial')]/img[contains(@src,'https://static.javatpoint.com/images/icon/java.png')]");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium Tutorials");
		highLighterMethod(driver,driver.findElement(By.xpath("//input[@name='q']"))) ;
		
		highLighterMethod(driver,driver.findElement(By.xpath("//img[@class='lnXdpd']"))) ;
		driver.findElement(By.xpath("//img[@class='lnXdpd']")).click();
		
		highLighterMethod(driver,driver.findElement(By.name("btnK"))) ;
		driver.findElement(By.name("btnK")).click();
		driver.close();
	}
	
	public static void highLighterMethod(WebDriver driver, WebElement ele) {
		
		try {
			String originalStyle = ele.getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;

			for (int i = 0; i < 2; i++) {
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
				Thread.sleep(150);
				js.executeScript("arguments[0].setAttribute('style', '" + originalStyle + "');", ele);
				Thread.sleep(150);
			}
		} catch (Exception e) {
				System.out.println(e.getMessage());
		}
	}
}
