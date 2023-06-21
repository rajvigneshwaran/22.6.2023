package com.BrowserElementImplement;



import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webpagefind {

private static WebElement element;

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver() ;
driver.get("https://www.facebook.com/");

By userNameLocator=By.id("email");
WebElement userName=driver.findElement(userNameLocator);
userName.sendKeys("9597571227");
By name=By.name("pass");
WebElement password=driver.findElement(name);
password.sendKeys("rajmohan");
element.click();
driver.quit();
	}
}
 

