package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import SeleniumBase.seleniumbase;


// git added upto here
public class Woolworths extends seleniumbase {

	String title = "Woolworths Supermarket - Buy Groceries Online";
	
	WebDriverWait wait;

	@Test(priority = 0)
	void testcaseonesearch() throws InterruptedException {

		launch("chrome", "https://www.woolworths.com.au/");
		WebElement searchclick = element("xpath", "//input[@id='wx-headerSearch']");
		typeandeneternter(searchclick, "Apples & Pears", Keys.ENTER);
		Thread.sleep(2000);
		System.out.println(getTitle());
	//	Assert.assertEquals(title, getTitle());


	}

	@Test(priority = 1)
	void productfiltered() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.textToBePresentInElement(filtered, title))
		WebElement filtered = element("xpath", "//span[.='Relevance']");
		
		
        click(wait.until(ExpectedConditions.elementToBeClickable(filtered)));
        
		//wait.until(ExpectedConditions.elementToBeClickable(filtered)).click();
		//		click(filtered);
		//		System.out.println("Product filtered");
		quit();
	}

}
