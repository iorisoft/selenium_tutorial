package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	//This method return a Webdriver Object
	public static WebDriver open(String browserType)
	{
		if(browserType.equalsIgnoreCase("chrome"))
		{
			//Code for Chrome
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			return new ChromeDriver();
		}else 
		{
			//Code for Firefox
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
			return new FirefoxDriver();
			
		}
	}

}
