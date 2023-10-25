package eCom_Website.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/eCom_Website/features",
        glue = "eCom_Website/stepDefinations"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
