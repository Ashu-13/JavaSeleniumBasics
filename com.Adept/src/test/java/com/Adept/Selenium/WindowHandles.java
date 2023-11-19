package com.Adept.Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize window
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

		// getWindowHandle -- current tab

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.cssSelector("a[href$='google.com']")).click();

		// Set - removes duplicate values/entries
		// ArrayList can store duplicate entries

		Set<String> windows = driver.getWindowHandles();

		for (String childWindow : windows) {

			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				driver.close();
			}

		}

		driver.switchTo().window(parentWindow);
		String parentTitle = driver.getTitle();

		System.out.println(">>>>>>>>" + parentTitle);

		
		  ArrayList<String> windowTabs = new ArrayList<>(windows); 
		  windowTabs.get(0); //parent window 
		  windowTabs.get(1); // child window
		  
		 
	}

}
