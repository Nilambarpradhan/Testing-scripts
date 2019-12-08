package com.dec5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Test_page_detail {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http:\\google.com");
		String pgtitle= driver.getTitle();
		System.out.println("page title::"+pgtitle);
		System.out.println("page length :: "+pgtitle. length());
		String strurl = driver.getCurrentUrl();
		System.out.println("URL of page::"+strurl);
		System.out.println("url length:: "+strurl.length());
		Thread.sleep(5000);
		driver.close();

	}

}
