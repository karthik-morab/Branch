package com.self.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
	
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Karthik");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("8971696841");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
	}

}
