package co.com.choucair.certification.proyectobasescreenplay.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/GoogleTraductor.feature",
        tags = "@RunnerTags",
        glue = "co.com.choucair.certification.proyectobasescreenplay.stepdefinitions",

        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}
