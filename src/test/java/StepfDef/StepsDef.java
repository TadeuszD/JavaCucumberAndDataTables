package StepfDef;

import Calculator.Calc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pl.Kiedy;
import io.cucumber.java.pl.Wtedy;
import io.cucumber.java.pl.Zakładającże;
import org.junit.jupiter.api.Assertions;

public class StepsDef {
    Calc calc;
    int result;

    @Given("Class initialized")
    public void Class_initialized() {
        calc = new Calc();
    }

    @When("I add {int} and {int}")
    public void i_add_two_numbers(Integer int1, Integer int2) {
        result = calc.sum(int1, int2);
    }

    @Then("result is {int}")
    public void result_is(Integer int1) {
        Assertions.assertEquals(int1, result);
    }

    // Gherkin in Polish

    @Zakładającże("kalkulator jest włączony")
    public void kalkulator_jest_włączony() {
        calc = new Calc();
    }

    @Kiedy("dodaję {int} i {int}")
    public void dodaję_i(Integer int1, Integer int2) {
        result = calc.sum(int1, int2);
    }

    @Wtedy("wynik wynosi {int}")
    public void wynik_wynosi(Integer int1) {
        Assertions.assertEquals(int1, result);
    }

}
