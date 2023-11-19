package com.Adept.Selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		driver.get("https://resume.naukri.com/resume-quality-score");
		
		driver.findElement(By.className("browse")).click();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		StringSelection filepath = new StringSelection("C:\\Users\\user\\Desktop\\FrameworkLayout.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		
		// To paste the path of file
		
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_V);
		
		
		
		// to release the already pressed buttons
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		// Press and release of enter key
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.close();
				
		
	}

}
