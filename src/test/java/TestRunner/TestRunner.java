package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features", 
		glue = { "StepDefinition" },
		plugin = { "pretty","html:target/cucumber-reports" ,
					"json:target/cucumber-reports.json",
					"junit:target/cucumber-reports.xml"},
		monochrome = true,
		dryRun = false,
		tags = "@smoke and @sanity"
		)
public class TestRunner {

}
