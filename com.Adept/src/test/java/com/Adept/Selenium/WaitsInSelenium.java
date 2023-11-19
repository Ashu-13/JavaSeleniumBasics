package com.Adept.Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		

		driver.manage().window().maximize(); // Maximize window
		
		driver.get("https://www.facebook.com/");
		
		// Implicit wait
		// Once set, the implicit wait is set for the entire life of the session
		// Polling frequency  - 500 ms
		
		// 5 elements - 3 element loaded, 2 elements has a delay of 2 seconds
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				
		// Explicit Wait / WebDriverWait
		// polling freq 500 ms
		// used with multiple conditions
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		WebElement element123 = wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
		element123.click();
	
		
		
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("abc")));
		ele.click();
		
		// If both Implicit and explicit wait is there , selenium will wait for addition of both waits
		
		
		
		// Fluent Wait
		// Polling freq can be set manually
		// exceptions can be ignored
		
		Wait<WebDriver> Fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofNanos(1))
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		
		
		WebElement eleOfFluent = Fwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("abc")));
		eleOfFluent.click();
		
		
		
		
		
		
	}

}
