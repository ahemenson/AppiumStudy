package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, 
                 features = "classpath:features", glue = "tests",
                 tags = {"@login"})
public class Runner {
	
}

