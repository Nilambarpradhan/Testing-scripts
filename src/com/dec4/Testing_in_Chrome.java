package com.dec4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing_in_Chrome {

	public static void main(String[] args)throws Throwable {
		//Lunch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//Enter URL
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Enter username
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		Thread.sleep(5000);
		//Enter password
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		Thread.sleep(5000);
		//Click on Login
		driver.findElement(By.id("login")).click();
		Thread.sleep(10000);
		//Exit
		driver.close();
		
	}

}
