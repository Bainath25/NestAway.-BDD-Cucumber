package Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="./src/test/java/Features/Loginfeatures.feature",
					 glue= {"StepDefinition"},
					 dryRun=false,
					 monochrome = true)
					 
public class Runner extends AbstractTestNGCucumberTests {

	
 }
