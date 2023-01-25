package org.test.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
	public static WebDriver driver;
	
	public static WebDriver chromeLaunch() {
		
		WebDriverManager.chromedriver().setup();
		 return driver=new ChromeDriver();
	}
	
	//for edge
	 
	public static WebDriver edgeLaunch() {
		WebDriverManager.edgedriver().setup();
		 return driver=new ChromeDriver();

	}
	
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static void impwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS );
		driver.manage().window().maximize();
			
	}
	
	public static void sendkeys(WebElement e, String data) {
		e.sendKeys(data);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static String getAttribute(WebElement e) {
		String a = e.getAttribute("value");
		return a;
	}
	
	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
	
	public static void alert() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}

	public void selectByIndex() {
		

	}
	
}

