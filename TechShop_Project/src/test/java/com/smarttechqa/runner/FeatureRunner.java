package com.smarttechqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/"},
		glue = {"com.smarttechqa.stepdef","com.smarttechqa.hooks"},
		monochrome = true,
		dryRun = true
		//tags= "@smoke",
		
		 
		)
public class FeatureRunner extends AbstractTestNGCucumberTests {   

}
