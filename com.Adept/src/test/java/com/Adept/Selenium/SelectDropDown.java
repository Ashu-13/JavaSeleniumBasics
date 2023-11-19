package com.Adept.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		driver.get("https://trytestingthis.netlify.app/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//--------------------------Upload a file----------------------------
		WebElement uploadbtn = driver.findElement(By.id("myfile"));
		uploadbtn.sendKeys("path of file C://desktop//testfolder//testimage.jpg");
		//----------------------------------------------------------------------
		
		WebElement mayank = driver.findElement(By.id("option"));
		 
		// Select class is used for dropdowns which is being made of Select tags
		
		Select option = new Select(mayank);
		
		option.selectByIndex(2);
		option.selectByValue("option 2");
		option.selectByVisibleText("Option 3"); // Preferred
		
		System.out.println("Test complete");
		driver.close();
		
		
		
	}

}
