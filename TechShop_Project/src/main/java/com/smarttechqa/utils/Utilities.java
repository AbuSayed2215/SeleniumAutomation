package com.smarttechqa.utils;

import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import SmartTechQA.BaseClass;

public class Utilities extends BaseClass{
	
	public static WebElement getExplicitWait(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elem;
	}
	
	public static void actionClick(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver; //casting - changing the type of the object
		executor.executeScript("arguments[0].click();", element);
	}
	
	public static void elementScroll(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView", element);
	}
	
	public static void scrollToBottomPage() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void scrollToTopPage() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0,0)");
		
	}
	
	
	
	}


