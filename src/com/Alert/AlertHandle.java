package com.Alert;

import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.WebDriver;

public class AlertHandle{


public static void main()throws InterruptedByTimeoutException, InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.leafground.com/alert.xhtml;jsessionid=node0gbkfl5uqae9i1g4sov460mw4a84804.node0");
	
	driver.findElement(By.xpath("//span[text()='Show'])[1]"));
	
	Thread.sleep(3000);
	

	TargetLocator TargetLocatorswitchTo = driver.switchTo();
	
	
	Alert simpleAlert= driver.switchTo().alert();
	
	simpleAlert.accept();
	
	driver.findElement(By.id("j_idt88:j_idt93"));
	
	Thread.sleep(3000);
	
	Object AlertConfirmAlert;
	
	AlertConfirmAlert=driver.switchTo().alert();
	
	Alert confirmAlert = null;
	
	
	confirmAlert.dismiss();
	
	driver.findElement(By.id("j_idt88:j_idt104"));
	
	Thread.sleep(3000);
	
	Alert PromptAlert=driver.switchTo().alert();
	
	PromptAlert=SendKeys("vignesh");
	WebElement fbText=driver.findElement(By.tagName("h2"));
	
	String text=fbText.getText();
	
	System.out.println(text);
	
	WebElement userName=driver.findElement(By.id("email"));
	userName.sendKeys("vignesh");
	
	String attribute=userName.getAccessibleName();
	
	System.out.println("Attribute:"+attribute("value"));
	
	System.out.println("user Entered value:"+attribute());
}

private static String attribute(String string) {
	// TODO Auto-generated method stub
	return null;
}

private static String attribute() {
	// TODO Auto-generated method stub
	return null;
}

private static Alert SendKeys(String string) {
	// TODO Auto-generated method stub
	return null;
}}



	


