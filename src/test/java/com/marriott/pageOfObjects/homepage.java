package com.marriott.pageOfObjects;

import org.openqa.selenium.WebDriver;

import com.marriott.reusablecomponents.reusablemethods;
import com.marriott.uistore.Homepage;

public class homepage 
{
	
	
	
	
	public static boolean main_page(WebDriver driver)
	{
		if(reusablemethods.click(Homepage.our_brands, driver));
		{
			return true;
		}	
  }
	public static boolean verifiy(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		if(driver.findElement(Homepage.list_below).isDisplayed())
		{
			if(reusablemethods.click(Homepage.xmark, driver))
			{
		 return true;
			}
		}
		return false;
	}
	public static boolean find(WebDriver driver)
	{
		if(reusablemethods.click(Homepage.find_hotels,driver))
		{
			return true;
		}
		return false;
	}
	public static boolean send_destination(WebDriver driver, String value) throws InterruptedException
	{
		if(reusablemethods.click(Homepage.search, driver))
		{
			Thread.sleep(1000);
			if(reusablemethods.sendkeys(Homepage.search, value, driver))
			{
				Thread.sleep(1000);
				if(reusablemethods.enter(Homepage.search, driver))
				{
					return true;
				}
			}
		}
		return false;
	}

}
	
