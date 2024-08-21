package SeleniumBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.BaseInterface;

public class seleniumbase implements BaseInterface {

	public static WebDriver driver = null;
	ChromeDriver wait = null;

	@Override
	public void launch(String browser, String url) {

		switch (browser.toLowerCase()) {

		case "chrome":

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
			

			break;

		case "firefox":

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);

			break;

		case "Edge":

			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);

			break;

		default:
			break;
		}

	}

	@Override
	public void windowhandle(int i) {

	}

	@Override
	public void quit() {
		driver.quit();

	}

	@Override
	public void close() {
		driver.close();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
		
		
	}

	@Override
	public void click(WebElement ele) {

		wait = new WebDriverWait(driver, null);
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}

	@Override
	public void typekeys(WebElement ele, String value) {

		ele.sendKeys(value);

	}
	
	public void typeandeneternter(WebElement ele, String value , Keys key) {

		ele.sendKeys(value, Keys.ENTER);

	}

	@Override
	public WebElement element(String type, String value) {

		switch (type.toLowerCase()) {
		case "xpath":
        //we can use return or break statement if we use return then if it find the type 
		//if  1st statement it will retun like break
			return driver.findElement(By.xpath(value));


		case "id":

			return driver.findElement(By.id(value));


		case "name":

			driver.findElement(By.name(value));

			break;

		default:
			break;
		}

		return null;
	}

}
