package com.marriott.stepDefinition; 

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.runner.RunWith;
import org.testng.Assert;

import com.aventstack.extentreports.model.Log;
import com.marriott.pageOfObjects.Hotel_address;
import com.marriott.pageOfObjects.homepage;
import com.marriott.pageOfObjects.verifies;
import com.marriott.reusablecomponents.reusabledriver;
import com.marriott.reusablecomponents.reusablemethods;
import com.marriott.utilities.logger;

@RunWith(Cucumber.class)
public class Homepage_stepdefinition extends reusabledriver
{
private org.apache.logging.log4j.Logger log=LogManager.getLogger(Homepage_stepdefinition.class.getName());
	
@Given("^Launch the browser and enter the url$")
public void launch_the_browser_and_enter_the_url() throws Throwable
{
    reusabledriver.chromedriver();
    reusablemethods.loadurl(driver);
    reusablemethods.timelapse(driver);
}

@When("^Click on our brands in homepage$")
public void click_on_our_brands_in_homepage() throws Throwable {
   try
   {
	boolean result= homepage.main_page(driver);
   logger.loginfo(log,"our brands in homepage link is clicked");
   Assert.assertTrue(result);
   }
   catch(AssertionError e)
   {
	  logger.logerror(log, "our brands in homepage link is not clicked"); 
   }
}


@And("^Verify if the JWMarriott is listed in the list or not$")
public void verify_if_the_jwmarriott_is_listed_in_the_list_or_not() throws Throwable {
   try {
	boolean result= homepage.verifiy(driver);
   logger.loginfo(log,"JW-Marriott is verified");
   Assert.assertTrue(result);
   }
   catch(AssertionError e)
   {
	  logger.logerror(log, "JW-Marriott is not verified"); 
   }
}

@Then("^User navigate to another page$")
public void user_navigate_to_another_page() throws Throwable
{
	logger.loginfo(log, "validated successfully");
    System.out.println("validated");
    driver.quit();
}

@Given("^Launch the browser and enter the maritto url$")
public void launch_the_browser_and_enter_the_maritto_url() throws Throwable 
{
	 reusabledriver.chromedriver();
	    reusablemethods.loadurl(driver);
	    reusablemethods.timelapse(driver);
}

@When("^Enter the destination in the destination field \"([^\"]*)\"$")
public void enter_the_destination_in_the_destination_field_something(String strArg1) throws Throwable
{
	try
	{
	boolean result=homepage.send_destination(driver, strArg1);
	 logger.loginfo(log,"Destination is sent");
	   Assert.assertTrue(result);
	   }
	   catch(AssertionError e)
	   {
		  logger.logerror(log, "Destination is not sent"); 
	   }
	
	
}



@When("^Click on find hotels in the homepage$")
public void click_on_find_hotels_in_the_homepage() throws Throwable 
{
	try
	{
    boolean result= homepage.find(driver);
    logger.loginfo(log,"Find hotels is clicked");
    Assert.assertTrue(result);
    }
    catch(AssertionError e)
    {
 	  logger.logerror(log, "Find hotels is not clicked"); 
    }
}
@And("^Verify the address in the first hotel \"([^\"]*)\"$")
public void verify_the_address_in_the_first_hotel_something(String strArg1) throws Throwable 
{ try {
	boolean result=Hotel_address.address(driver, strArg1);
	 logger.loginfo(log,"Find hotels is clicked");
	    Assert.assertTrue(result);
	    }
	    catch(AssertionError e)
	    {
	 	  logger.logerror(log, "Find hotels is not clicked"); 
	    }
         driver.close();
}


@Given("^Launch the browser and enter the maritto url in$")
public void launch_the_browser_and_enter_the_maritto_url_in() throws Throwable {
	 reusabledriver.chromedriver();
	    reusablemethods.loadurl(driver);
	    reusablemethods.timelapse(driver);
}

@When("^Click on Member benefits under member benefits$")
public void click_on_member_benefits_under_member_benefits() throws Throwable {
    try
    {
	boolean result=verifies.verifies(driver);
	logger.loginfo(log,"Find hotels is clicked");
    Assert.assertTrue(result);
    }
    catch(AssertionError e)
    {
 	  logger.logerror(log, "Find hotels is not clicked"); 
    }
}

@When("^verify the mobile key and mobile check in \"([^\"]*)\"$")
public void verify_the_mobile_key_and_mobile_check_in_something(String strArg1) throws Throwable {
   
	try
	{
	boolean result=verifies.text_verify(driver, strArg1);
	logger.loginfo(log,"Member file  is verified");
    Assert.assertTrue(result);
    }
    catch(AssertionError e)
    {
 	  logger.logerror(log, "Member  is not verified"); 
    }
	driver.close();
}

}