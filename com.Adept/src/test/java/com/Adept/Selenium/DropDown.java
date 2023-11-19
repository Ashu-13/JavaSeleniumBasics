package com.Adept.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		driver.get("https://www.makemytrip.com/");
		
//------------------Find the number of links in a webpage--------------------
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberOfLinks = links.size();
		System.out.println(numberOfLinks);
//----------------------------------------------------------------------
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.findElement(By.id("fromCity")).sendKeys("Del");
       
		
		List<WebElement> options = driver.findElements(By.cssSelector("ul[class='react-autosuggest__suggestions-list']>li"));
        //options = Delhi, Dehradun,Mumbai,Jaipur,Chandigarh..
		
		String ourOption = "Dehradun";
      
		//iteration -- size of List named as options
		for(WebElement ele : options) {
        	String currOption= ele.getText();
        	
        	if(currOption.contains(ourOption)) {
        		ele.click();
        		break;
        	}
        }
		

  
  
	}

}
