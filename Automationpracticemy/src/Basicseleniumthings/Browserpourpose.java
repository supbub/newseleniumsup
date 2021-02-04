package Basicseleniumthings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserpourpose {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP PC\\Downloads\\New folder\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe"); //wrong path
//	WebDriver driver = new ChromeDriver();
	
   driver.get("http://demo.guru99.com/test/newtours/"); 


	}

}
