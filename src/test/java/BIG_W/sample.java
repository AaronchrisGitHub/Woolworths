package BIG_W;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
	
	WebDriver driver=new ChromeDriver();
	
	@Test
	void run() throws InterruptedException
	{
		
	//    quick interview questions
	//    1)how many navigation commands are there in selenium & how to achieve it?                 ans:  4commands
    //    2)Difference between driver.get() & driver.nagivate.to()
	//    3)how to refresh the page without using navigation method                                ans:  3 ways ( 1st refresh comand 
		//2nd keys enum from selenium    3rd robert keys 
		
		
	driver.navigate().to("https://www.amazon.in/");
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ice cream", Keys.ENTER , Keys.F5);
	

	
	Thread.sleep(2000);
	//driver.navigate().refresh();
	 
	//it will refresh
	//driver.navigate().back();         //it will back the webpage 
	//driver.navigate().forward(); 
	//driver.navigate().back();
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("done", Keys.ENTER);
	System.out.println("complted succesfully");
	}
	
	

}
