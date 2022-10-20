package com.smarttechqa.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngPractice {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googleSearch() {
		driver.findElement(By.name("q")).sendKeys("helloworld");
		driver.findElement(By.name("q")).submit();
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
	}
	@Test(enabled = true)
	public void imageSearch() {
		driver.findElement(By.linkText("Images")).click();
		
	}
	@AfterMethod
public void tearDown() {
	//driver.quit();
	}
}
