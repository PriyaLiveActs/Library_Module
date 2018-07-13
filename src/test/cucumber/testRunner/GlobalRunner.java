package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"Featurefiles/global.feature"},
                    glue = {"stepDefinition"})

public class GlobalRunner extends AbstractTestNGCucumberTests {
}
