package com.dec4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args)throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("feel my love song");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Feel My Love Video S")).click();
		Thread.sleep(50000);
		driver.close();
	}

}
