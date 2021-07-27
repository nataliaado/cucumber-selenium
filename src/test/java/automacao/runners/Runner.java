package automacao.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/automacao/features/Cliente.feature", glue = {
		"" }, monochrome = true, dryRun = false, tags = { "@regressivo" })

public class Runner {

}
