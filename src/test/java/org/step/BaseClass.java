package org.step;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
 static WebDriver driver = new ChromeDriver();
	
	
	public static void launchURL(String value) {
		driver.get(value);

	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
		

	}
	
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	public static void passTheValues(String string, String value) {
	    driver.findElement(By.xpath(value));
  
	}
	
	public static void clickTheButton(String value) {
		driver.findElement(By.xpath(value));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
