package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/freeCRMLogin.feature" })
public class FreeCRMLoginFeatureRunner extends AbstractTestNGCucumberTests {
	
	
}
