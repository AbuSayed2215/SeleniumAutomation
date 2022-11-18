package com.smarttechqa.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import SmartTechQA.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class NegativeLoginStepDefination extends BaseClass {
	

@Given("I open the browser and i nvigate to the application")
public void i_open_the_browser_and_i_nvigate_to_the_application() {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
    
}

@When("I click on the sign in button on homepage")
public void i_click_on_the_sign_in_button_on_homepage() {
	driver.get("https://www.smarttechqa.com/");
	driver.findElement(By.xpath("//a[@href='/login']")).click();
    
}

@When("i enter {string} and {string}")
public void i_enter_and(String email, String password) {
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("password")).sendKeys(password);
   
    
}

@When("I click on the login button")
public void i_click_on_the_login_button() {
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); 
   
    
}

@Then("I suppouse to get a error message")
public void i_suppouse_to_get_a_error_message() {
	String expected = "Invalid email or password";
	String actual = driver.findElement(By.xpath("//div[@class='fade alert alert-danger show']")).getText();
	Assert.assertEquals(actual, expected);
    
}
@Then("close the browser")
public void close_the_browser() {
   driver.quit();
}
}
