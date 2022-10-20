package com.smarttechqa.stepdef;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.elements.ElemenPage;
import com.smarttechqa.utils.Utilities;

import SmartTechQA.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination extends BaseClass {
	
	ElemenPage pf = PageFactory.initElements(driver, ElemenPage.class);

	



@Given("User opens the browser")
public void user_opens_the_browser() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	//BaseClass.SetUp();
}
@Given("User navigate to {string}")
public void user_navigate_to(String string) {
	driver.get("https://www.smarttechqa.com/");
}
@When("User clicks the Sign in button")
public void user_clicks_the_sign_in_button() {
	pf.getLoginButton().click();
	//driver.findElement(By.xpath("//a[@href='/login']")).click();
    
}

@When("User Enters the email")
public void user_enters_the_email() {
	//driver.findElement(By.id("email")).sendKeys("abusayed@gmail.com");  
    pf.getEmail().sendKeys("abusayed@gmail.com");
    Utilities.getHighLighter(pf.getEmail());
}

@When("User Enters the password")
public void user_enters_the_password() throws IOException {
	//driver.findElement(By.id("password")).sendKeys("123456");
	pf.getPassword().sendKeys("123456");
	Utilities.getHighLighter(pf.getPassword());
	Utilities.takeScreenShot(); 
    
}

@When("User Clicks on the Sign In button")
public void user_clicks_on_the_sign_in_button() {
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();   
    
}
@Then("The user is successfully logged in and username is displayed")
public void the_user_is_successfully_logged_in_and_username_is_displayed() {
	String Expected = "Abu Sayed";
	  driver.findElement(By.id("username")).getText();
	Assert.assertEquals("Actual", "Expected");
	
}

@Then("User is navigate to home page")
public void user_is_navigate_to_home_page() {
    //driver.findElement(By.xpath("//a[@class='active navbar-brand']")).click();
    
}

@When("User click on the Search box and searches for {string}")
public void user_click_on_the_search_box_and_searches_for(String string) {
	pf.getSearch().sendKeys("\"iphone\"");
    
}

@When("User clicks on the search Button")
public void user_clicks_on_the_search_button() {
	driver.findElement(By.name("q")).submit(); 
    
}

@Then("User will find the specific item")
public void user_will_find_the_specific_item() throws IOException {
   driver.findElement(By.xpath("//a[@href='/']")).click();
}

@When("User clicks on the latest producyt from the homepage")
public void user_clicks_on_the_latest_producyt_from_the_homepage() {
	driver.findElement(By.xpath("//a[@href='/']")).click();
    
}

@Then("User is able to see the latest product")
public void user_is_able_to_see_the_latest_product() {
    
    
}

@When("User clicks on the cart button")
public void user_clicks_on_the_cart_button() {
	driver.findElement(By.xpath("//a[@href='/cart']")).click();
    
}

@Then("User is navigated to the Cart Page")
public void user_is_navigated_to_the_cart_page() {
    
    
}

@Then("I want to check user is able to pay for the item")
public void i_want_to_check_user_is_able_to_pay_for_the_item() {
   // driver.quit();
    
}


}
