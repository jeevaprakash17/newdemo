package Cucumber.demotest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/demotest/src/test/java/selecucudemo1.feature",
tags="@RegressionTest")
public class TestRunnerBG {

}
