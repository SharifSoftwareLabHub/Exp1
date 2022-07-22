package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AdvancedStepdefs {
    private AdvanceCalculator calculator;
    private int value1;
    private int value2;
    private double result;

    @Before
    public void before() {
        calculator = new AdvanceCalculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void advTwoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I ([*/^]) the two values$")
    public void iTheTwoValues(String operator) {
        result = calculator.Calculate(value1, value2, operator);
        System.out.println(result);
    }

    @Then("^I Expect the result (.+)$")
    public void iExpectTheResult(String arg0) {
        Assert.assertEquals(arg0, String.format("%,.1f", result));
    }

}