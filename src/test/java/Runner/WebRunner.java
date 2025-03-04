package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
                  glue = "WebSteps",
                  plugin = {"pretty","html:target/cucumber-reports/cucumber.html"},
                   tags = "@LT3")
public class WebRunner extends AbstractTestNGCucumberTests {

}
