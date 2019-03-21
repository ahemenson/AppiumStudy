package br.com.curso.appium.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class CalculadoraTest2 {

	@Test
	public void deveSomarDoisValores() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "0047038667");
		desiredCapabilities.setCapability("automationName", "appium");
		// desiredCapabilities.setCapability("platformVersion", "8.0");
		desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
		desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		//MobileElement el0 = (MobileElement) driver.findElementById("com.google.android.calculator:id/pad_advanced");
		
		//TouchActions action = new TouchActions(driver);
		//action.scroll(el0, 10, 100);
		//action.perform();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



		MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.calculator:id/op_add");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result");

		// System.out.println(el6.getText());

		assertEquals("4", el4.getText());

		driver.quit();

	}

}
