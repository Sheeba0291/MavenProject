package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefs.ProjectSpecificMethods;

@CucumberOptions(features = "src\\test\\java\\features\\EditLead.feature",
                 glue = {"stepDefs", "hooks"},
                 monochrome = true,
                 publish = true,
                 tags = "@smoke")
public class RunCucumberTest extends ProjectSpecificMethods{

}
