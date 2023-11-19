package com.Adept.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement ele = driver.findElement(By.id("timerAlertButton"));
		ele.click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		
		driver.quit();
		

	}

}
