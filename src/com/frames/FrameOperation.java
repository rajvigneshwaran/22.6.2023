package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FrameOperation {


	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	driver.switchTo().frame("login_page");
	
	WebElement coustomerID = driver.findElement(By.xpath("//input[@type='text']"));
	
	coustomerID.sendKeys("1234");
	}
}