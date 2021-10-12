package com.self.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.id("username")).sendKeys("ABC");
		driver.findElement(By.name("pw")).sendKeys("123");
		//class name with spaces(compound classes are allowed in selenium webdriver)
		//driver.findElement(By.className("button r4 wide primary")).click();//error
	}

}
