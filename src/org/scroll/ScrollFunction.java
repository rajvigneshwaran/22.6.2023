package org.scroll;

import java.util.concurrent.Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollFunction {

	  

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");
		
		RemoteWebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		
		executor.executeScript("window.scrollBy(0,2000)");
	 Thread.sleep(3000);
	 executor.executeScript("window.scrollBy(0,-2000)");
	 	WebElement idol=driver.findElement(By.xpath("//img[contains@alt,'vintage Gulley Brass']"));
	 	executor.executeScript("arguments[0].ScrollIntoView(true)", idol);
	 	
		 driver.quit();
		}

}

