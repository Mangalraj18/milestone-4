package com.marriott.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features =".//resources",
		glue="com.marriott.stepDefinition"
       // tags={"@Trainbookin","_@offers"}	
)
public class Runner2_testng extends AbstractTestNGCucumberTests
{
	
	
	
	
}

	