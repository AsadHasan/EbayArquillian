package features.stepdefinitions;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import PageObjects.Homepage;

public class SearchAutoCompletion {
	
	@Page private Homepage homepage;
	
	@Given("^I am on the homepage$")
	public void I_am_on_the_homepage(){
	    homepage.clicksearchButton();
	}

	@When("^I type laptop$")
	public void I_type_text(){

	}

	@Then("^laptop computer should appear in autocomplete suggestions$")
	public void result_should_appear_in_suggestions(){
  
	}
}
