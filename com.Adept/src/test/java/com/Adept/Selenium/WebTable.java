package com.Adept.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		driver.get("https://trytestingthis.netlify.app/");
	
		List<WebElement> headers = driver.findElements(By.cssSelector("table>tbody>tr>th"));
		
		// for fetching data we can use cssSelector= "table>tbody>tr>td"

		for(WebElement ele : headers) {
			
			String headerValue = ele.getText();
			System.out.println(headerValue);
			/*
			 * if(headerValue.contains("Gender")) { System.out.println("Test pass"); }
			 */
		}
		
	}

}
