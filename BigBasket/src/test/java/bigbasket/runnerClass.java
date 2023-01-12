package bigbasket;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/featureFiles/BigBasket.feature",
		//tags ="@regressionTest"
		tags = "@smokeTest"

		)		

public class runnerClass {

}

