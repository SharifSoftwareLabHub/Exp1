package calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features/calculator.feature")
@RunWith(Cucumber.class)
public class CalcRunnerTest {
}
