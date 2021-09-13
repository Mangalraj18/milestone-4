package com.marriott.pageOfObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.marriott.reusablecomponents.reusablemethods;
import com.marriott.uistore.Member_benefits;
import com.marriott.uistore.verify;

public class verifies 
{
	public static boolean verifies(WebDriver driver)
	{
	 if(reusablemethods.click(Member_benefits.member, driver))
	 {
		 return true;
	 }
	 return false;
	}
	
	
	public static boolean text_verify(WebDriver driver, String value)
	{
		String value1=driver.findElement(Member_benefits.text).getText();
		Assert.assertEquals(value1, value);
		System.out.println("Mobile check in verified successfully");
		return true;
		
	}
	
}
