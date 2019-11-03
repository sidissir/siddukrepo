package com.equalexperts.runners;

/**
 * @author Siddu
 */
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

//TestNG runner class. 
@CucumberOptions(features = { "src/test/resources/functionalfeatures" }, glue = {
		"com/equalexperts/stepdefinitions", }, plugin = { "pretty", "html:target/cucumber-reports/",
				"json:target/cucumber-reports/cucumber.json" }, monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
