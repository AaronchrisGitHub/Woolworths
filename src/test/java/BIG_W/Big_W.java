package BIG_W;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Big_W {
	
	
	public static void run()
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://www.bigw.com.au/");
		System.out.println("Lev one completed");
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		run();
	}

}
