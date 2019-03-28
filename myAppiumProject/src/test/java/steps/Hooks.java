package steps;

import cucumber.api.java.After;
import org.junit.AfterClass;
import org.junit.Before;

import core.DriverFactory;

public class Hooks {	

	@Before
	public void inicializarAppium() {
		DriverFactory.getDriver();
	}

	@AfterClass
	public static void finalizaClass() {
		DriverFactory.killDriver();
	}

	@After
	public void tearDown() {
		DriverFactory.getDriver().resetApp();
	}

}
