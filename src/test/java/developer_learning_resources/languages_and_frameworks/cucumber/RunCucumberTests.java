package developer_learning_resources.languages_and_frameworks.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report.html"},
		features = {"src/test/resources"},
		tags = "not @ignore"
)
public class RunCucumberTests {
}