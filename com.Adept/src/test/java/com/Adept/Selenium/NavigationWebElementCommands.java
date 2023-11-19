package com.Adept.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationWebElementCommands {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		

		driver.manage().window().maximize(); // Maximize window
		
		driver.get("https://www.facebook.com/");
		
		  driver.navigate().to("https://www.google.com/");
		  
		  Thread.sleep(5000);
		  driver.navigate().refresh();
		  
		  Thread.sleep(5000);
		  driver.navigate().back();
		  Thread.sleep(5000);
		  driver.navigate().forward();
		  
		  
		 // WebElemnt Commands:-
		 // .click(), .clear(), .sendKeys()
		  WebElement abc = driver.findElement(By.id("something"));
		  
		  abc.clear();
		  abc.click();
		  abc.sendKeys("hi");
		  
		  boolean ans = abc.isDisplayed();  // True/False
		  
		  
		  boolean ans1=abc.isEnabled(); 
		  
		  String txt1 = abc.getText();
		  
		  if(txt1.equals("Forget")) {
			  System.out.println("Test Pass");
		  }
		  System.out.println("Fail");
		  
		  abc.getAttribute("name");
		  
		  //Difference between findElement vs findElements
		  
		  WebElement oneDropdown = driver.findElement(By.className("xyz"));
		  
		  List<WebElement> dropdown= driver.findElements(By.className("dropDownList"));
		  
		  dropdown.size();
		  
		 
		

	}

}
