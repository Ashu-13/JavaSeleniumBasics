package com.Adept.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ashu");
		
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("122334455");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
	
						
		
	}

}
