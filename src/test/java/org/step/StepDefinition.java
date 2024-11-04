package org.step;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public WebDriver driver = new ChromeDriver();
	
	@Given("User have to open the faceboo application through chrome browser")
	public void user_have_to_open_the_faceboo_application_through_chrome_browser() {
	driver.get("https://www.facebook.com/");    
	}

	@Given("User have to maximize the window")
	public void user_have_to_maximize_the_window() {
	   driver.manage().window().maximize();
	}
//WITH HEADER
	@When("User have to pass the valid username and invalid password")
	public void user_have_to_pass_the_valid_username_and_invalid_password(io.cucumber.datatable.DataTable map) {
	    Map<String, String> asMap = map.asMap(String.class, String.class);
	    
	    driver.findElement(By.id("email")).sendKeys(asMap.get("username"));
	    driver.findElement(By.name("pass")).sendKeys(asMap.get("password"));
	
	}
	@When("User have to pass the invalid username and invalid password")
	public void user_have_to_pass_the_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable maps) {
	  List<Map<String, String>> maps1 = maps.asMaps();
	  Map<String, String> map2 = maps1.get(0);
	  driver.findElement(By.id("email")).sendKeys(map2.get("username"));
	   driver.findElement(By.name("pass")).sendKeys(map2.get("password"));
	}

	@When("User have to pass the invalid username and valid password")
	public void user_have_to_pass_the_invalid_username_and_valid_password(io.cucumber.datatable.DataTable list) {
      List<String> list1 = list.asList();
		driver.findElement(By.id("email")).sendKeys(list1.get(0));
		driver.findElement(By.name("pass")).sendKeys(list1.get(1));
		 
	}
	
	@When("User have to pass the valid username and valid password")
	public void user_have_to_pass_the_valid_username_and_valid_password(io.cucumber.datatable.DataTable lists) {
	    List<List<String>> lists1 = lists.asLists();
	    
	    List<String> all = lists1.get(1);
	    
	    driver.findElement(By.id("email")).sendKeys(all.get(0));
		driver.findElement(By.name("pass")).sendKeys(all.get(1));
	    
	}


	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("User have to close the window")
	public void user_have_to_close_the_window() {
	    driver.quit();
	}


}

	


	
	
	
	
