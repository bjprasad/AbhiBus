package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature\\BusAvailabilitySearch.feature", dryRun=false, glue= {"stepDefinitions"}, plugin= {"html:target"})
	public class TestRunner {
		// TODO Auto-generated constructor stub
	}

