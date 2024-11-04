package org.stepDefinitionCreateNewAccount;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.step.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition  {
	public static WebDriver driver = new ChromeDriver();
	@Given("User have to open the facebook application through chrome browser and maximize the window")
	public void user_have_to_open_the_facebook_application_through_chrome_browser_and_maximize_the_window() {
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}
	
	@Given("User have to wait for few seconds")
	public void user_have_to_wait_for_few_seconds() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("User have to click the create new account")
	public void user_have_to_click_the_create_new_account() {
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    
	}

	@When("User have to pass the Valid {string},Vaild {string}")
	public void user_have_to_pass_the_Valid_Vaild(String string, String string2) {
     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(string);
	 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(string2);
	 
	}

	@When("User Have To Select The Valid {string},Valid {string}")
	public void user_Have_To_Select_The_Valid_Valid(String string, String string2) {
	   WebElement Date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	   Select s = new Select(Date);
	   s.selectByIndex(5);
	   WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
	   Select s1 = new Select(Month);
	   s1.selectByIndex(5);
	   WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	   Select s2 = new Select(Year);
	   s2.selectByIndex(6);
	   driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
	   }
	
	@When("User have to pass the Valid {string}")
	public void user_have_to_pass_the_Valid(String string) {
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(string);
	}


	@Then("User have to set valid the {string}")
	public void user_have_to_set_valid_the(String string) {
	   driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys(string);
	}



@When("User have to pass the valid username and invalid password")
public void user_have_to_pass_the_valid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
  List<String> list = dataTable.asList();
  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(list.get(0));
  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(list.get(1));
   
}



@When("User have to pass the invalid username and invalid password")
public void user_have_to_pass_the_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
    List<List<String>> lists = dataTable.asLists();
	List<String> list = lists.get(1);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(list.get(0));
	 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(list.get(1));
}



}







