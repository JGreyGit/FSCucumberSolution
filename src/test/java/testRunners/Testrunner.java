package testRunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features={"C:\\Users\\Owner\\eclipse-workspace\\FSCucumberSolution\\src\\test\\resources\\features\\letsTalkTea.feature"},
    	glue = {"stepDefinition\\EmailModelStepDef"},
		plugin = {"pretty" ,  "html:test-output","html:target/report/cucumber", "json:target/report/json/login.json"},
		monochrome = true

)

public class Testrunner {

}

