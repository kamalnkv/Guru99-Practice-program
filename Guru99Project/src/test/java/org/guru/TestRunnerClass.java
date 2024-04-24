package org.guru;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//TestRunnerClass

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\welcome\\eclipse-workspace\\Guru99Project"
		+ "\\src\\test\\resources\\Guru99demo.feature",glue="org.step",monochrome=true,dryRun=false)


public class TestRunnerClass {

}
