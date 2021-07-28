package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on logon page")
	public void user_is_on_logon_page() {
	    System.out.println("inside step Login");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside step user inputs");
	}

	@And("User clicks Login")
	public void user_clicks_login() {
		System.out.println("inside step click login");
	}

	@Then("User navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("inside step homepage");
	}
}
