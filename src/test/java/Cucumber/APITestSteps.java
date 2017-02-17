package Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class APITestSteps {

	APITestDefinition service;

	@Given("^User with msisdn \"(.*)\"$")
	public void user_with_msisdn(String msisdn) throws Throwable {
		service = new APITestDefinition();
		service.getJSON(msisdn);
	}

	@When("^VCID request send$")
	public void vcid_request_send() throws Throwable {
		service.sendRequest();
	}

	@Then("^validate response$")
	public void validate_response() throws Throwable {
		service.validateResponse();
	}

	@Then("^validate entry in ZIAM database$")
	public void validate_entry_in_ZIAM_database() throws Throwable {
		service.validatedatabase();
	}
}