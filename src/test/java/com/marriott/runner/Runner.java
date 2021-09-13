package com.marriott.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources",
		glue="com.marriott.stepDefinition",
        plugin= {"html:target/cucumber-reports.html"})
public class Runner
{
}

	