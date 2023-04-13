import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {}, features = "C:\\Users\\Shani.Kumar\\Downloads\\SerinityDemo (1)\\SerinityDemo\\src\\test\\resources\\Features\\Login.feature", glue = "StepDefinition")
public class CucumberSuite {
}
