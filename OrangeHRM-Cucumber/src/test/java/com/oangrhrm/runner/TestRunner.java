package com.oangrhrm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Swag_Labs_Login_Functionality.feature",
		glue ="com.orangehrm.step_definitions",
		dryRun = false,
		monochrome = true
		)
public class TestRunner {

}
