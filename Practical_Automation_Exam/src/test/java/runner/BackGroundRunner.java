package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"classpath:features"},
	glue = "steps",
	tags = "@DBScenario1",
	monochrome = true,
	dryRun = false,
	plugin = {
			"pretty",
			"html:target/cucumber",
			"json:target/cucumber.json"
	}
	
		)


public class BackGroundRunner {

}
