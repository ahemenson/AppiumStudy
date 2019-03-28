package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, 
                 features = "src/test/java/features/", glue = "steps",
                 tags = {"@login"},
                 monochrome = true)
public class Runner {
	
}

