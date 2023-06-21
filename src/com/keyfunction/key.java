package com.keyfunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class key {
	

  public static void main(String[] args) throws AWTException, InterruptedException {
		System .setProperty("Webdriver.edge.driver", "https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");
		
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("1234");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
