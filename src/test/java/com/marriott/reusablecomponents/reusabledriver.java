package com.marriott.reusablecomponents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class reusabledriver 
{
	public static WebDriver driver;
	public static WebDriver chromedriver()
	{
		String value=com.marriott.utilities.Propertyfilereader.browsername();
		if(value.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",com.marriott.utilities.Propertyfilereader.getChromePath());
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);	
		}
		 else if(value.equalsIgnoreCase("edge"))
		   {
			   System.setProperty("webdriver.edge.driver", com.marriott.utilities.Propertyfilereader.getEdge());
				 driver=new EdgeDriver();
		   }
		   else
		   {
		     System.setProperty("webdriver.gecko.driver",com.marriott.utilities.Propertyfilereader.getFirefoxPath());
			 driver=new FirefoxDriver();
			
		   }
		 driver.manage().window().maximize();
		 return driver;
	}
	 public static void captureScreen(String tname) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File( ".\\Screenshots\\" + tname + ".png");
			try {
				FileUtils.copyFile(source, target);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Screenshot taken");
		}	
}
