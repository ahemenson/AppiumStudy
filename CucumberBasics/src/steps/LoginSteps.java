package steps;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	@Before
	public void setUp() {
		System.out.println("setUp \n");
	}
	
	@After
	public void tearDown() {
		System.out.println("\n tearDown \n");
	}
	
	@Before("@prod")
	public void setUpProd() {
		System.out.println("setUp - Prod \n");
	}
	
	@After("@prod")
	public void tearDownProd() {
		System.out.println("\n tearDown - Prod \n");
	}

	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
		System.out.println("given");
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
		System.out.println("when");
	}
	
	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_valid_username(String username) throws Throwable {
		System.out.println("then username: "+username);
	}

	@And("^user entered \"([^\"]*)\" password$")
	public void user_entered_valid_password(String password) throws Throwable {
		System.out.println("And pass: "+password);
	}

	@Then("^user \"([^\"]*)\" succesfully logged in$")
	public void user_succesfully_logged_in(String validateLogin) throws Throwable {
		System.out.println("then logged: "+validateLogin);
	}
	
	@And("^user validate the captcha image$")
	public void user_validate_the_captcha_image() throws Throwable {
		System.out.println("@And -- user validate the captcha image");
	}
	
	@And("^user select the age category$")
	public void user_select_the_age_category(DataTable table) throws Throwable {
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		System.out.println("@And -- user select the age category: "+data.get(0).get("Age") + " Location: " + data.get(0).get("Location"));
	}
	
//	@And("^user select the age category$")
//	public void user_select_the_age_category(List<String> list) throws Throwable {
//		System.out.println("@And -- user select the age category: "+list.get(1));
//	}

//	@Then("^user entered \"([a-zA-Z]{1,})\" username$")
//	public void user_entered_valid_username(String username) throws Throwable {
//		System.out.println("then username: "+username);
//	}
//
//	@And("^user entered \"([a-zA-Z]{1,})\" password$")
//	public void user_entered_valid_password(String password) throws Throwable {
//		System.out.println("And pass: "+password);
//	}
//
//	@Then("^user \"([a-zA-Z]{1,})\" succesfully logged in$")
//	public void user_shouldbe_succesfully_logged_in(String validateLogin) throws Throwable {
//		System.out.println("then logged: "+validateLogin);
//	}
//	
//	@Then("^user entered invalid username$")
//	public void user_entered_invalid_username() throws Throwable {
//	   
//	}
//
	
	
//	@Then("^user entered invalid password$")
//	public void user_entered_invalid_password() throws Throwable {
//	    
//	}
//
//	@Then("^user shouldnot succesfully logged in$")
//	public void user_shouldnot_succesfully_logged_in() throws Throwable {
//	    
//	}
//


}
