package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import steps.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, 
                 features = "classpath:features", glue = "steps",
                 tags = {"@login"},
                 monochrome = true)
public class Runner extends Hooks {
	
}

