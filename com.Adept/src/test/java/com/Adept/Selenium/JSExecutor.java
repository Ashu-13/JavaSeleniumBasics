package com.Adept.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//locators, click,sendkeys,waits, dropdown

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		
		driver.get("https://www.amazon.com/");
		//driver.get("https://www.google.com/");
		// scroll, click, sendKeys
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//js.executeScript("alert('FESTIVE SEASON IS HERE !!')");
		//js.executeScript("prompt('Enter Name')");
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		
		
		
		/*
		 * WebElement link = driver.findElement(By.linkText("Date"));
		 * js.executeScript("arguments[0].click();",link);
		 */ 
		
		
		js.executeScript("location.reload()");	
	
		System.out.println("Test Completed");
		
		
	}

}
