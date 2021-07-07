package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
	features =	{"src/test/resources/Appfeature/Uber.feature"},
	glue = {"stepdefenition"},
	tags = "@All",
	plugin ={"pretty"})


public class ubertest {

	


}
