package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/table.xhtml;jsessionid=node01j2hjx1pi8m93dc9t33jylca4105099.node0");
		
		
		
		WebElement row1 = driver.findElement(By.xpath("//tr[@data-ri='0']"));
		
		driver.findElement(null);
		
	}

}
