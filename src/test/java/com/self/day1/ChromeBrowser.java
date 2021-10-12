package com.self.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?locale2=en_US");
		
//		//find by id
//		driver.findElement(By.id("email")).sendKeys("mkarthik2299@gmail.com");
//		//Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("8971696841");
//		//Thread.sleep(2000);
//		
//		//find by name
//		//driver.findElement(By.name("login")).click();
//		
//		//linktext(anchor tags)
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		
		
		
		driver.close();

	}

}
