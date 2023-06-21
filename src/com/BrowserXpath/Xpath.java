package com.BrowserXpath;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
private static WebElement element;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");

	WebElement SearchBox=driver.findElement(By.xpath("//input[@type='text']"));
	SearchBox.sendKeys("oneplus");
	
	element.click();
}
}

