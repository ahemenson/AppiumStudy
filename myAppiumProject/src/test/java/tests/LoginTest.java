package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.DriverFactory;
import pages.LoginPage;


public class LoginTest {
	
	private LoginPage loginPage = new LoginPage();
	
	@Before
	public void inicializarAppium() {
		DriverFactory.getDriver();
		DriverFactory.getDriver().findElementById("com.android.packageinstaller:id/permission_allow_button").click();  
	}
	
	@AfterClass
	public static void finalizaClass() {
		DriverFactory.killDriver();
	}
	
	@After
	public void tearDown() {		
		DriverFactory.getDriver().resetApp();
	}
		
	
	@Test
	public void loginValido() {
		loginPage.inserirEmail("foo@example.com");
		loginPage.inserirSenha("hello");
		loginPage.clicarBotaoLogin();
		Assert.assertTrue(loginPage.elementIsDisplayed());
	}
	
	@Test
	public void loginInvalido() {
		loginPage.inserirEmail("teste");
		loginPage.inserirSenha("hello");
		loginPage.clicarBotaoLogin();
		Assert.assertEquals(".LoginActivity", loginPage.getCurrentActivity());
	}
	
	@Test
	public void validarToast() {
		loginPage.inserirEmail("foo@example.com");
		loginPage.inserirSenha("hello");
		loginPage.clicarBotaoLogin();		
		Assert.assertEquals("exemplo toast", loginPage.getToast());
	}

}
