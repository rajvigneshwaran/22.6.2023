package com.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTopics\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Redmi 10 (Midnight Black, 4GB RAM, 64GB Storage)']")).click();
		
		String ParentWindow = driver.getWindowHandle();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String a : windowHandles) {
			
			if(!a.contains(ParentWindow)) {
				
				driver.switchTo().window(a);
				
			}
		}
				driver.findElement(By.id("add-to-cart-button")).click();
				driver.quit();
	}

}
