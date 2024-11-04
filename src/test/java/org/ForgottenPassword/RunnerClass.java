package org.ForgottenPassword;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features\\forgottenPassword.feature",glue = "org.ForgottenPasswordStepDefinition",dryRun = false)
public class RunnerClass {




}
