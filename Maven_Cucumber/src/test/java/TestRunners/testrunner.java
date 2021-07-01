package TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/* here i will pass the parameters of feature file and StepDefination file where these
 are located, both files information i have to give in this test runner class.
 * CucumberOptions is an annotation which actually takes two inputs, one is where's the 
  feature file is located and other one is glue--that is nothing but a parameter to define
  stepDefination file.
 */	

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/test/java/feature",
            glue="stepDefinations")
public class testrunner {

}
