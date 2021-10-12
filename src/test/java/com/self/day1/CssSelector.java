package com.self.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Karthik");
		driver.findElement(By.cssSelector("#password")).sendKeys("8971696841");
		driver.findElement(By.cssSelector("#Login")).click();
		

		
		
		driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();

	}

}
