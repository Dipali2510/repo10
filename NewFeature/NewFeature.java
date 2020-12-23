import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.lang.String;

public Class NewFeature {
  
  @Given("^condition$")
  public void condition() {
    org.junit.Assert.fail();
  }
  
  @When("^Condition<passworrd>$")
  public void ConditionPassworrd() {
    org.junit.Assert.fail();
  }
  
  @Then("^result$")
  public void result() {
    org.junit.Assert.fail();
  }
  
}
