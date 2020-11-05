package batchRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="Feat",glue="stepDefine",plugin="json:target/cucumberreport.json")
public class TestRunner {

}
