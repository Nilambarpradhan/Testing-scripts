package com.dec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_newtours {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	//navigate to url
	driver.navigate().to("http://newtours.demoaut.com");
	Thread.sleep(5000);
	// Clicking on signup 
	driver.findElement(By.linkText("REGISTER")).click();
	Thread.sleep(5000);
	//filling all fields
	driver.findElement(By.name("firstName")).sendKeys("Nilambar");
	Thread.sleep(2000);
	driver.findElement(By.name("lastName")).sendKeys("pradhan");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7205251352");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#userName")).sendKeys("xyz@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("address1")).sendKeys("Sai laxmi hostel");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Ameerpet");
	Thread.sleep(2000);
	driver.findElement(By.name("city")).sendKeys("Hydrabad");
	Thread.sleep(2000);
	driver.findElement(By.name("state")).sendKeys("Telengana");
	Thread.sleep(2000);
	driver.findElement(By.name("postalCode")).sendKeys("500038");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='country']")).sendKeys("INDIA");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("nilambar");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Nil@1234");
	Thread.sleep(2000);
	driver.findElement(By.name("confirmPassword")).sendKeys("Nil@1234");
	Thread.sleep(2000);
	driver.findElement(By.name("register")).click();
	Thread.sleep(5000);
	driver.quit();
	}

}
