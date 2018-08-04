package testRunner;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;



/*@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        //coverageReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        //excludeCoverageTags = {"@flaky" },
        //includeCoverageTags = {"@passed" },
        outputFolder = "target")*/

@CucumberOptions (plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        features = {"Featurefiles/globalmaster/DefineAuthor.feature"},
                    glue = {"stepDefinition"},
                    tags={"@scenario1"})

public class GlobalRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void reportSetup(){
        System.out.println("Entering @AfterClass for Report generation ");
        Reporter.loadXMLConfig(new File("Configuration/extent_config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo ( "Time Zone", System.getProperty ( "user.timezone" ) );
        Reporter.setSystemInfo("64 Bit", "Windows 7");
        Reporter.setTestRunnerOutput("**Sample test runner output message**");
    }
}
