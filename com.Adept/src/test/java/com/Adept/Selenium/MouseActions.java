package com.Adept.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
		
		Actions action = new Actions(driver);
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).perform();
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		
     WebElement loginButton =driver.findElement(By.linkText("Gmail"));
     
     action.moveToElement(loginButton).perform();
     Thread.sleep(5000);
     System.out.println("Passed");
     
     // Toggle move
     WebElement mayank = driver.findElement(By.id("mayank"));
     action.moveToElement(mayank, 45, 0);
     
     //Right Click
     
     WebElement login= driver.findElement(By.id("login"));
     
     action.moveToElement(login)
     .contextClick()
     .build().perform();
     
     
     
     
     
		
	}

}
