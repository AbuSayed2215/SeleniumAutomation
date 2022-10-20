package com.smarttechqa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SmartTechQA.BaseClass;

public class ElemenPage extends BaseClass{
	public ElemenPage(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(xpath = "//*[@type='email']" )
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(id = "password")
	@CacheLookup 
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(name = "q")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
}
