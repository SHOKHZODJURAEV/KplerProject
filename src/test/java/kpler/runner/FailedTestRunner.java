package kpler.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "kpler/step_definitions",
        features = "@target/rerun.txt",
        publish = true
        // tags = ""


)
public class FailedTestRunner {
}
