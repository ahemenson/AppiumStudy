package steps;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

import core.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps {

	private LoginPage loginPage = new LoginPage();

	private void inicializarAppium() {
		DriverFactory.getDriver();
		DriverFactory.getDriver().findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	}


	@Given("^I am on the Login screen$")
	public void i_am_on_the_Login_screen() throws Throwable {
		this.inicializarAppium();
	}

	@When("^I insert valid email$")
	public void i_insert_valid_email() throws Throwable {
		loginPage.inserirEmail("foo@example.com");
	}

	@And("^I insert valid pass$")
	public void i_insert_valid_pass() throws Throwable {
		loginPage.inserirSenha("hello");
	}

	@And("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
		loginPage.clicarBotaoLogin();
	}

	@Then("^I should logged on the app$")
	public void i_should_logged_on_the_app() throws Throwable {
		Assert.assertTrue(loginPage.elementIsDisplayed());
	}

}
