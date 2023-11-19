package com.Adept.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		driver.get("https://www.facebook.com/");
		
		// obj.method().build().perform(); -- Syntax
		// Actions act = new Actions(driver)
		
		// Actions class - mouse and keyboard operations
	
		// mouse operations - click, doubleClick, rightclick, dragandDrop, hover
		//keyboard operation - enter, tab , shift,ctrl, delete
		
		Actions act = new Actions(driver);
		
		
		act.moveToElement(driver.findElement(By.className(""))).build().perform();
		
	//	act.sendKeys(Keys.TAB).build().perform();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("Ashu");
		act.sendKeys(Keys.TAB);
		act.pause(Duration.ofSeconds(3))
		.sendKeys("1234567890")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER)
		.build().perform();
		
 WebElement passwordField = driver.findElement(By.id("pass"));
		
	// left click - .click();
   // right click- contextClick()
  // mouse hover - moveToElement()
 // draganddrop - dragAnddrop(source,target) 
 
   
		
		
		
		
		
		
		
		
		

	}

}
