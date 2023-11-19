package com.Adept.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		
		driver.get("https://www.agoda.com/");
		
		
	    String date="Sat Aug 26 2023";
	    
	   
	  
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[aria-label*='Close ']")).click();
		driver.findElement(By.cssSelector("[class*='check-in']")).click();
		Thread.sleep(2000);
		
		
	//	driver.findElement(By.xpath("//div[starts-with(@class,'DayPicker') and @aria-label='Sun Oct 16 2022']"));
		
		driver.findElement(By.xpath("//div[starts-with(@class,'DayPicker') and @aria-label='"+date+"']")).click();
			
		System.out.println("-----Test Completed------");
		
		

	}

}
