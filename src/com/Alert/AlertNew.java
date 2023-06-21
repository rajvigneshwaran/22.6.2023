package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertNew {

	

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.leafground.com/alert.xhtml");
	
	//simple alert
	driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	Thread.sleep(3000);
	TargetLocator switchTo = driver.switchTo();
	Alert simpleAlert = switchTo.alert();
	simpleAlert.accept();
	
	//confirm alert
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	Thread.sleep(3000);
	Alert confirmAlert = driver.switchTo().alert();
	confirmAlert.dismiss();
	
	//prompt alert
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	Thread.sleep(3000);
	Alert promptAlert = driver.switchTo().alert();
	promptAlert.sendKeys("Samantha");
	Thread.sleep(3000);
	promptAlert.accept();
	
	driver.navigate().to("https://www.facebook.com/");
	
	
	WebElement fbText=driver.findElement(By.tagName("h2"));
	String text=fbText.getText();
	
	System.out.println(text);
	
	WebElement userName=driver.findElement(By.id("email"));
	userName.sendKeys("vignesh@gmailcom");
	
	
	String attribute = userName.getAttribute("placeholder");
	System.out.println(attribute);
	
	
	}
}
