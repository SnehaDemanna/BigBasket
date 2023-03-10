package bigbasket;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/featureFiles/BigBasket.feature",
		tags ="@regressionTest",
		//tags = "@smokeTest",
		plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cubes.xml",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)		

public class runnerClass 
{

}

