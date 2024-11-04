package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features\\login.feature",glue = "org.step",dryRun = false,
plugin = {"pretty", "json:C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\Reports\\Json Report\\fb.json"} )
public class Runner {

	
	@AfterClass
	public static void report() {
	 JvmReport.generateJvmReport("C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\Reports\\Json Report\\fb.json");

	}
	
}