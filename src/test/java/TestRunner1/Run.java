package TestRunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//FeatureFile1/Login1.feature"},	// path to run feature files 	
	  	glue = "StepsDefinition1", 	// step definition package name
		dryRun =  false,
		monochrome = false,		// To print output in Readable format
		plugin = {"pretty", "html:target/Reports/tags.html"}	//  To generate report under Target folder.
		)	

public class Run 
{
 // this class will be empty
}