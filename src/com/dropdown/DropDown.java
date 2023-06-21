package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_0_Ea")).click();
		
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day"));
		
		Select select = new Select(day);
		
		select.selectByValue("5");
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select select2=new Select(month);
		
	    select.selectByValue("5");
	    
	    
	    WebElement year=driver.findElement(By.id("year"));
	    
	    Select select3=new Select(year);
	    
	    select3.selectByIndex(1);
	    
	   List<WebElement>options = select.getOptions();
	   
	    for(WebElement a:options) {
	    	
	    System.out.println(a.getText());
	    
		driver.quit();
		
	}

	}
	}

