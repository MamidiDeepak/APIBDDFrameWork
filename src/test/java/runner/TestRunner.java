package runner;

import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = {"src/test/resources/featureless"},
        features = {"src/test/resources/featurefiles"},
        glue = {"step.definitions"},
        monochrome = true,
        dryRun = false,
        plugin = {"json:build/cucumber-reports/cucumber.json",
                "rerun:build/cucumber-reports/rerun.txt"
        })

public class TestRunner {


}
