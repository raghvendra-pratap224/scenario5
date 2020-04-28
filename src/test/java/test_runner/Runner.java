package test_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		, glue = "test_definition"
		, plugin = { "json:target/cucumber.json" }
		)
public class Runner {

}
