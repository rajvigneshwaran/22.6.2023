package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {



public static void main(String[] args) {
	
	System.setProperty("Webdriver.edge.driver", "C://EdgeDriver.exe");
	
	
	EdgeDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(" https://www.amazon.in/");
	
	Action actions=new Action();
	
	WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));
	
	 actions.click(SearchBox).perform();
	 
	SearchBox.sendKeys("oneplus");
	
	 actions.doubleclick(SearchBox).perform();
	
	actions.context(SearchBox).perform();
}

private Actions context(WebElement searchBox) {
	
	// TODO Auto-generated method stub
	return null;
}

private Actions doubleclick(WebElement searchBox) {
	// TODO Auto-generated method stub
	return null;
}

private Actions click(WebElement searchBox) {
	// TODO Auto-generated method stub
	return null;
}
	
}

