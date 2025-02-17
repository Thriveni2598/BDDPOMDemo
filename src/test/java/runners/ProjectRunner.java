package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src//test//resources//features//PlaceOrder.feature",
		glue= {"stepDefs"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"html:target/reports/HTMLReport.html",
		}
		
		)

public class ProjectRunner extends AbstractTestNGCucumberTests {

}
