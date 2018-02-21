package com.cucumber.framework.stepdefinitions;

import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToFreeCRM {

	@Given("^User navigated to freecrm\\.com$")
	public void user_navigated_to_freecrm_com() throws Throwable {
		TestBase.driver.get("www.google.ca");
	}

	@When("^user enter username as \"(.*?)\" and password as \"(.*?)\"$")
	public void user_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^login should not be successful$")
	public void login_should_not_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}	
	
}
