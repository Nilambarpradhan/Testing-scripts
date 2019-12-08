package com.dec4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args)throws Throwable {
	         	//Lunch Chrome Browser
				ChromeDriver driver=new ChromeDriver();
				//Enter URL
				driver.get("http://orangehrm.qedgetech.com");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//Enter username
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				Thread.sleep(5000);
				//Enter password
				driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
				Thread.sleep(5000);
				//Click on Login
				driver.findElement(By.id("btnLogin")).click();
				//Logout
				//driver.findElement(By.id("welcome")).click();
				//driver.findElement(By.linkText("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/logout")).click();
				Thread.sleep(10000);
				//Exit
				driver.close();
				


	}

}
