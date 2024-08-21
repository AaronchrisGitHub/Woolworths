package BIG_W;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BigW {

	public WebDriver driver;
	
	public static String value;

	public BigW() throws FileNotFoundException, IOException {

		Properties prop = new Properties();

		prop.load(new FileInputStream("config.properties"));

		String Browser_name = prop.getProperty("Browser");

		String url_value = prop.getProperty("url");

		if (Browser_name.equalsIgnoreCase("firefox")) {
			
			this.driver = new FirefoxDriver();
			driver.get(url_value);

		}
		if (Browser_name.equalsIgnoreCase("chrome")) {

			this.driver = new ChromeDriver();
			driver.get(url_value);
		}

	}
	
	
	public String a() 
	
	{
		String value ="Complted from 1ST CLASS";
		System.out.println();
		return value;
		
	}
	

	public WebDriver getDriver() {
		return driver;

	}

}
