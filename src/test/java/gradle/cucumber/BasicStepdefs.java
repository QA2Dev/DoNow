package gradle.cucumber;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
public class BasicStepdefs {


    @When("^I run a step$")
    public void i_run_a_step() throws Exception {
        // Write code here that turns the phrase above into concrete actions
System.out.println("done");
    }

    @Then("^I see you$")
    public void i_see_you() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("well");
    }


}