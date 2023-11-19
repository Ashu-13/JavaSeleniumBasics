package com.Adept.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.messages.internal.com.google.common.io.Files;

public class ScreenshotAlertInSelenium {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize(); // Maximize window
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\sample\\mayank.png");

        try {
            FileHandler.copy(file, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    
      // Alert - Single Click - Accept(OK)
      //  with two options Ok and Cancel
       // Alert with text fields
        
        
     driver.findElement(By.id("alertbox")).click();
     driver.switchTo().alert().dismiss();
     driver.switchTo().window("abc");
     driver.switchTo().frame(1);
     
		 
     driver.close();	
 
}

}
