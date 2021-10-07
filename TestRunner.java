package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},

plugin = {"pretty",
		"json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml",
		}
)
public class TestRunner {

}
//plugin={"pretty","html:target/HtmlReports"},