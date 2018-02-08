package gradle.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},features = "src/test/resources/features",glue = "gradle.cucumber")
public class RunCukesTest {

}