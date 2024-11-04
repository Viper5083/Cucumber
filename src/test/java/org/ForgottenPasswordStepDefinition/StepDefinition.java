package org.ForgottenPasswordStepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition {
	public static WebDriver driver = new ChromeDriver();
	@Given("User have to open the facebook application through chrome browser and maximize the window")
	public void user_have_to_open_the_facebook_application_through_chrome_browser_and_maximize_the_window() {
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}

	@Given("User have to click the forgotten password button")
	public void user_have_to_click_the_forgotten_password_button() {
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@Given("User have to wait for few seconds")
	public void user_have_to_wait_for_few_seconds() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("User have to pass the Valid {string}")
	public void user_have_to_pass_the_Valid(String string) {
	    driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(string);
	}

	@When("User have to pass the Email Address")
	public void user_have_to_pass_the_Email_Address(io.cucumber.datatable.DataTable dataTable) {
	    List<String> list = dataTable.asList();
	    driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(list.get(0));
	    
	}




}
