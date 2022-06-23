package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = ("seleniumgluecode"),
        publish = true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "not @Google and not @AsesoriaLegal and not @ComprarInmueble and not @ConstruirInmueble"
)


public class Testrunner {
}
