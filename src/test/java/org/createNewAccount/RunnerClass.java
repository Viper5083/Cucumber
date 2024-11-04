package org.createNewAccount;

import org.junit.AfterClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.json.Json;
import org.testrunner.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features\\createNewAccount.feature",glue = "org.stepDefinitionCreateNewAccount",dryRun = false,
plugin = {"pretty","json:C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\target\\Reports\\Json Report\\fb.json"})
 
public class RunnerClass {

	@AfterClass
	public static void report() {
          
		JvmReport.generateJvmReport("C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\target\\Reports\\Json Report\\fb.json");
 	}
	
	
	
	}


