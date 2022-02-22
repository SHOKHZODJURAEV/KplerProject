package kpler.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "src/test/java/kpler/step_definitions",
        features = "rerun:target/rerun.txt"
        // tags = ""


)
public class FailedTestRunner {
}
