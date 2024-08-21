package com.Base;

import org.openqa.selenium.WebElement;

public interface BaseInterface {
	
	
	
	void launch(String browser , String url);
	
	void windowhandle(int i);
	
	void quit();
	
	void close();
	
	void click(WebElement ele);
	
	void typekeys(WebElement ele, String value);
	
	WebElement element(String type, String value);
	
	

}
