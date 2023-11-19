package com.Adept.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		

		driver.manage().window().maximize(); // Maximize window
		driver.get("https://www.facebook.com/");
		
		/*
		<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" 
		 placeholder="Email address or phone number" autofocus="1"
		 aria-label="Email address or phone number">
			
		*/
		
		//Locator 1 - By ID
		
		
		// sendKeys("Ashu");
		//.click();
		
//Step-1 -- Identify the element:-
		WebElement email_field = driver.findElement(By.id("email")); // Identify the element
//Step-2 -- Perform some actions			
		email_field.sendKeys("Ashu123@gmail.com");
		//passowrd=1234456ashu*7&
// Step-1 -- Identify the element
     WebElement password_field = driver.findElement(By.id("pass"));
     password_field.sendKeys("1234456ashu*7&");

		WebElement email_field1 = driver.findElement(By.id("email")); // Identify the element
//Step-2 -- Perform some actions			
		email_field1.sendKeys("Test123@gmail.com");
   
		
		Thread.sleep(3000);
		
   // WebElement withTagName =driver.findElement(By.tagName("input"));
    //withTagName.sendKeys("hello");
    
    // identification of element           . Perform some action 
   // driver.findElement(By.tagName("input")).sendKeys("Hello");
    
    // driver.findElement(By.name("email")).sendKeys("ashu@gamil.com");
     
   //  driver.findElement(By.linkText("Forgotten password?")).click();
     
     driver.findElement(By.partialLinkText("Forgotten")).click();
     
    // Thread.sleep(3000); // pause the script for 3 seconds
   //  driver.findElement(By.tagName("input")).sendKeys("Hello");
     
     driver.findElement(By.cssSelector("input[placeholder='Email or phone']")).sendKeys("Hello");
     
 //    driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("hello");
     
     
     driver.findElement(By.cssSelector("input[id='identify_email']")).sendKeys("Hello");
     
     
     
	/*	
		
		
		driver.findElement(By.id("email")).sendKeys("Ashu");
		
		// By Name
		driver.findElement(By.name("pass")).sendKeys("Ashu@112233453645");
		
		// By LinkText
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
		//By PartialLinkText
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		// By TagName
		driver.findElement(By.tagName("input")).sendKeys("TestTest");
		
		*/
		
		
		
			
		
		
		
	}

}
