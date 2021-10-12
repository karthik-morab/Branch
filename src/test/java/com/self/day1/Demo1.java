package com.self.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");//hit url on the browser
		//get title
		System.out.println(driver.getTitle());//validate the page title is correct
		//get current url
		System.out.println(driver.getCurrentUrl());//validate you landed onto the correct URL
		//get page source
		//System.out.println(driver.getPageSource());// to get the page source
		
		//navigate
		
		driver.get("http://yahoo.com");
		//go back
		driver.navigate().back();
		//go forward
		driver.navigate().forward();
		
		//difference b/w close and quit
		
		
		//close the test after it is completed
		driver.close();//most recommended to use
		//it closes current browser
		
		//quit
	//	driver.quit();
		//it closes all the browsers opened by selenium script
		
		
	}

}
