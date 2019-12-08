package Dec2.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bowser {

	public static void main(String[] args) {
			System.setProperty("WebDriver.chrome.driver","E:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
				driver.get("http://gmail.com");
				driver.close();
				
	}
}
