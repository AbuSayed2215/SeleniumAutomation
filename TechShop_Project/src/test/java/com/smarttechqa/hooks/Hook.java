package com.smarttechqa.hooks;

import java.io.IOException;

import SmartTechQA.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass{
	@Before
	public static void initialize() throws InterruptedException, IOException {
		BaseClass.SetUp();
			
	}
	@After
	public static void tearDown() {
		driver.quit();
	}
}
