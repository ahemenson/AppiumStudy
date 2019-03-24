package br.com.curso.appium.core;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
	
	@Rule
	public TestName testName = new TestName();
	
	@AfterClass
	public static void finalizaClasse() {
		DriverFactory.killDriver();
	}
	
	@After
	public void tearDown() {		
		geraScreenshot();
		DriverFactory.getDriver().resetApp();
	}
	
	public void geraScreenshot() {
		File screenShot = (File) DriverFactory.getDriver().getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("target/screenshots/"+testName.getMethodName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
