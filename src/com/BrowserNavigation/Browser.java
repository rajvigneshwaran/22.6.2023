package com.BrowserNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.base.Strings;

public class Browser {
private static final char[] currenturl = null;
private static WebElement element;
private static Navigation navigate;

public static void main(String[] args)throws java.lang.InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();

	driver. navigate().to("https://www.facebook.com/");
	String title=driver.getTitle();
	System.out.println(title);
	 
	Thread.sleep(3000);
			
			
	driver.navigate().to("https://www.amazon.in/");
String url=driver.getCurrentUrl();

System.out.println(currenturl);
Thread.sleep(5000);
Navigation navigation=driver.navigate();

navigate.back();

driver.navigate().forward();
	WebElement SearchBox=driver.findElement(By.xpath("//input[@type='text']"));
	SearchBox.sendKeys("oneplus");
	Thread.sleep(3000);
	driver.navigate().refresh();
	element.click();
}

}
