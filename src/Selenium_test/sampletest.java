package Selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampletest {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhigna nakerekanti\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://google.co.in");
	
	driver.manage().window().maximize();
	
	driver.quit();

	}

}
