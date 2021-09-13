package com.marriott.pageOfObjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.marriott.reusablecomponents.reusablemethods;
import com.marriott.uistore.Member_benefits;
import com.marriott.uistore.verify;
import com.marriott.utilities.logger;

public class Hotel_address 
{
  public static boolean address(WebDriver driver,String value)
  {
	  String text=driver.findElement(verify.ver).getText();
	  if(text.contains(value))
	  {
		  System.out.println("Bangalore in the address  is verified");
		  return true;
	  }
	  else
	  {
		  System.out.println("Address in the search Page and destination page is wrong");
		  return false;
	  }
	  
  }
}
