package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Selenium_WorkSpace\\FreeCRMBDDFramework\\src\\main\\java\\features\\deals.feature",
		glue= {"stepDefinitions"},
		plugin= {"pretty", "html:test-output"},
		dryRun = false,
		monochrome = true,
		strict = true		
		)


public class TestRunner {

}
