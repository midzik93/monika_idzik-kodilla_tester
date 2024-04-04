package seasonchecker.homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class isItGameSteps {

    private int number;
    private String result;

    @Given("a {int}")
    public void a(Integer number) {
        this.number = number;
    }

    @When("I play the Game")
    public void i_play_the_game() {
        this.result = GameChecker.playGame(number);
    }

    @Then("Game should get \"\"Fizz\"\"")
    public void game_should_get_fizz() {
        assertEquals("Fizz", result);
    }

    @Then("Game should get \"\"Buzz\"\"")
    public void game_should_get_buzz() {
        assertEquals("Buzz", result);
    }

    @Then("Game should get \"\"FizzBuzz\"\"")
    public void game_should_get_fizz_buzz() {
        assertEquals("FizzBuzz", result);
    }

    @Then("Game should get \"\"None\"\"")
    public void game_should_get_none() {
        assertEquals("None", result);
    }
}
